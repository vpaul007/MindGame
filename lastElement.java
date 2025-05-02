package MindGame;

//import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class lastElement {
	
	public int largestNum(int nums[], int k) {
		
		//PriorityQueue<Integer> pq = new PriorityQueue<>(); //Largest
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //Smallest
		
		for(int num : nums) {
			pq.add(num);
			
			if(pq.size() > k) {
				pq.poll();
			}
			
		}
		return pq.peek();
		
		
	}

	public static void main(String[] args) {
		int k = 1;
		int nums[] = {3, 8, 9, 12, 90, 80, 76, 36, 77, 99, 55, 3};
		lastElement le = new lastElement(); //Object calling
		le.largestNum(nums, k);
		System.out.println(le.largestNum(nums, k));
		
		

	}

}
