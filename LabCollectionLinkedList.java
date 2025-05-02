package MindGame;

import java.util.LinkedList;

public class LabCollectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> named = new LinkedList<>();
		named.add("VP");
		named.add("Vijay");
		named.addFirst("RK");
		named.addLast("Kush");
		System.out.println(named);
		named.remove(0);
		System.out.println(named);
		named.removeFirst();
		System.out.println(named);
		named.removeLast();
		System.out.println(named);
		
		
		

	}

}
