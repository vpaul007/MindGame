package MindGame;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LabPriorityQueueNaturalOrder {

	public static void main(String[] args) {
		Queue<String> namePQ = new PriorityQueue<>();
		
		namePQ.add("VP");
		namePQ.add("HB");
		namePQ.add("RK");
		namePQ.add("K");
		namePQ.add("VP");
		System.out.println(namePQ); //Alphabetical Order
		
		Queue<Integer> numberPQ = new PriorityQueue<>();
		numberPQ.add(5);
		numberPQ.add(80);
		numberPQ.add(0);
		numberPQ.add(90);
		System.out.println(numberPQ);
		Iterator inNumbers = numberPQ.iterator();
		while(inNumbers.hasNext()) {
			System.out.println(numberPQ.poll() + " ");
		}
		
	}

}
