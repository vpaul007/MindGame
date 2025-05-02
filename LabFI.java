package MindGame;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LabFI {

	public static void main(String[] args) {
		LabFI apitest = new LabFI();
		apitest.predicate();
		apitest.supplier();
		apitest.consumer();
		apitest.function();
		apitest.boundMethod();

	}

	public void predicate(){
	Predicate<String> pStr = s -> s.contains("Paul");
	System.out.println(pStr.test("Vijay Paul"));
	
	BiPredicate<String, Integer> checkbi = (str, len) -> str.length() == len;
	System.out.println(checkbi.test("VijayPaul", 10));
}
	
	public void supplier() {
		
		//Supplier<T>  functional interface
		//T.get()
		
		Supplier<String> supstr = () -> new String();
		System.out.println("Vijay Paul" + supstr.get().concat(" VP"));
		
		Supplier<LocalTime> supTime = () -> LocalTime.now();
		System.out.println("Local Time :" + supTime.get());		
		
		Supplier<Double> sRandom = () -> Math.random();
		System.out.println(sRandom.get());
	}
	
	//Consumer accept() method functional interface
	public void consumer() {
		Consumer<String> consumeS = s -> System.out.println(s);
		consumeS.accept("Hi");
		List<String> names = new ArrayList<>();
		names.add("Vijay_1"); 
		names.add("Paul_1");
		names.forEach(consumeS);
	
		//BiConsumer<T, t>
		//voice accept(T t, U u)
		
		var capitalS = new HashMap<String, String>();
		
		BiConsumer<String, String> biCon = (k, v) -> capitalS.put(k,v);
		biCon.accept("HP", "SML");
		biCon.accept("PUN", "CH");
		biCon.accept("HY", "CH");
		System.out.println(capitalS);
	}
		//Function <T,R>
		// R apply(T , t)
		
	public void function(){
			
		Function<String, Integer> fun = s -> s.length();
		System.out.println(fun.apply("SHIMLA"));
		
		//Bifunction 

		BiFunction<String, String, String> biFun = (s1, s2) -> s1.toUpperCase() + s2.toLowerCase();
		System.out.println(biFun.apply("Vijay", " PAUl"));
		
		BiFunction<String, String, Integer> biFun1 = (s1, s2) -> s1.length() + s2.length();
		System.out.println(biFun1.apply("Vijay", "PAUl"));
		
		}
		
	public  void boundMethod() {
		String name = "Raman Kumari";
		Supplier<String> lowerL = () -> name.toUpperCase(); //Lambda
		Supplier<String> lowerM = name::toLowerCase; //method reference
		System.out.println(lowerL.get());
		System.out.println(lowerM.get());
		
		Predicate<String> titleL = (title) -> name.endsWith(title);
		
		
	}
	
	
	
}
