package MindGame;

import java.util.ArrayList;
import java.util.List;

public class LabGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List myList = new ArrayList();
		myList.add("Vijay");
		myList.add("Paul");
		myList.add(43);
		myList.add(new Dog("Dog", 5));
		
		String s = (String)myList.get(0);
		System.out.println(s);
		String s = (String)myList.get(2);

	}

}
