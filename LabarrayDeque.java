package MindGame;

import java.util.ArrayDeque;
import java.util.Deque;

public class LabarrayDeque {

	public static void main(String[] args) {
		Deque<Integer> numbers = new ArrayDeque<>();
		numbers.add(100);
		numbers.addFirst(80);
		numbers.offerFirst(70); //Head
		numbers.addFirst(100); //Head
		System.out.println(numbers);
		//add Last
		numbers.addLast(300); //Tail
		System.out.println(numbers);
		numbers.offerLast(250); //Tail
		System.out.println(numbers); 
		//Remove both end
		numbers.removeFirst();
		System.out.println(numbers);
		System.out.println(numbers.pollLast());
		System.out.println(numbers);
		
		//Offer Peek Poll
		
		System.out.println(numbers.offer(600));
		System.out.println(numbers.offer(7));
		System.out.println(numbers);
		System.out.println(numbers.peek()); //Head do not removed
		System.out.println(numbers.poll()); //Head will remove
		System.out.println(numbers);
		System.out.println(numbers.poll());
		System.out.println(numbers.poll());
		System.out.println(numbers.poll());
		System.out.println(numbers.poll());
		System.out.println(numbers.poll());
		System.out.println(numbers.poll());
	}

}
