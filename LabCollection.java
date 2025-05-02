package MindGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class LabCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection<String> coll = new ArrayList<>();
		Collection<String> coll = Arrays.asList("Vijay", "Kush", "Raman"); //Immutable
		
//		coll.add("Vijay"); //add method
//		coll.add("Kush");
//		coll.add("Raman");
//		System.out.println(coll);
//		coll.remove("Vijay"); //remove method
//		System.out.println(coll);
//		System.out.println(coll.isEmpty()); //method isEmpty
//		System.out.println(coll.size());
//		System.out.println(coll);
//		System.out.println(coll.contains("Kush")); //method contains
//		System.out.println(coll.removeIf(s -> s.startsWith("R"))); //Method removeif
//		System.out.println(coll);
//		coll.forEach(name -> System.out.println(coll));
//		coll.clear();
//		List<Double> dList = Arrays.asList(10.0, 12.0);
//		dList.stream().forEach(x->{ x = x+10;
//		System.out.println(x);});
		
//		//dList.stream().forEach(d->System.out.println(d));
//		List<Integer> ls = Arrays.asList(3,4,6,9,2,5,7);
//		System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b)->a>b?a:b));
//		System.out.println(ls.stream().max(Integer::max).get()); 
//		System.out.println(ls.stream().max(Integer::compare).get());
//		System.out.println(ls.stream().max((a, b)->a>b?a:b)); 
		List<Integer> ls = Arrays.asList(10, 47, 33, 23);  
		int max = ls.stream().max(Comparator.comparing(a->a)).get();
		System.out.println(max); 

	}

}
