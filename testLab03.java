package MindGame;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class testLab03 {

	public static void main(String[] args) {
		//PriorityQueue<String> pq = new PriorityQueue<String>();
		ArrayDeque<String> pq = new ArrayDeque<String>();
		pq.add("2");
		pq.add("4");
		System.out.println(pq.peek());
		//System.out.println(pq.poll());
		//System.out.println(pq);
		pq.offer("1");
		pq.add("3");
		pq.remove();
		//System.out.println(pq);
		System.out.println(pq.poll() + " ");
		//System.out.println(pq);
		if(pq.peek().equals("2"))
			System.out.println(pq.poll() + " ");
		System.out.println(pq.poll() + " " + pq.peek());
		

	}

}
