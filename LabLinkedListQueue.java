package MindGame;

import java.util.LinkedList;
import java.util.Queue;

public class LabLinkedListQueue {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(100);
		queue.add(10);
		queue.add(1);
		queue.add(50);
		queue.offer(200);
		System.out.println(queue);
		System.out.println(queue.element()); //Head | retrieve but not remove throw exception is empty
		System.out.println(queue.peek()); //head, return NULL if empty
		
		System.out.println(queue.remove()); //retrieve and remove the head
		System.out.println(queue);
		System.out.println(queue.poll());//Retrieve and remove the head
		System.out.println(queue);
		//Offer poll and peek are prefer method as it will not thow exception
		
	}

}
