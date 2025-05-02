package MindGame;

import java.util.ArrayList;
import java.util.List;

public class LabCollectionList {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		list.add("Vijay"); //add method
		list.add("Kush");
		list.add("Raman");
		list.add("Vijay");
		list.add(3, "GGG");
		list.add(3, "GGG");
		System.out.println(list);
		System.out.println(list.get(1)); //get method
		list.remove(0);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.set(0, "Paul");
		list.replaceAll(hhh -> hhh + " Hello");
		System.out.println(list);

	}

}
