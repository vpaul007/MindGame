package MindGame;

import java.util.function.Predicate;

interface Evaluate <T> {
	boolean isNegative(T t);

}

public class LabEvaluate {
	public static void main (String[] args) {
		Evaluate<Integer> lambda = i -> i<0;
		System.out.println("Evale:" + lambda.isNegative(-1));
		System.out.println("Evale:" + lambda.isNegative(1));
		
		//Predicate
		Predicate<Integer> predicat = i -> i<0;
		System.out.println("Predict:" + predicat.test(-1));
		System.out.println("Predict:" + predicat.test(1));
		
		//Calling Method check
		int x = 5;
		System.out.println("Is" + x + "Even?" + check(x, n -> n%2 == 0));
		x =7;
		System.out.println("Is" + x + "Even?" + check(x, n -> n%2 == 0));
		
		String name = "Mr. Vijay";
		System.out.println("Does" + name + "Start with M?" + check(name , s -> s.startsWith("Mr.")));
		name = "Vijay";
		System.out.println("Does" + name + "Start with M?" + check(name , s -> s.startsWith("Mr.")));
		}
	
	public static <T> boolean check(T t, Predicate<T> lambda) {
		return lambda.test(t);
		

		
	}
}