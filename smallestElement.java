package MindGame;

import java.util.Collections;
import java.util.PriorityQueue;

public class smallestElement {

	public int smallElement(int nums[], int k) {
		
		PriorityQueue<Integer> LE = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int num : nums) {
			LE.add(num);
			//System.out.println(LE);
			if(LE.size()>k) {
				LE.poll(); 
			}
			 
		}
		
		return LE.peek();
		
	}
	
	
	
	public static void main(String[] args) {
		
		int k = 3;
		int nums[] = {1, 8, 9, 12, 90, 80, 76, 36, 77, 99, 55, 200};
		smallestElement SE = new smallestElement();
		int result = SE.smallElement(nums, k);
		System.out.println(result);
	
	}

}
