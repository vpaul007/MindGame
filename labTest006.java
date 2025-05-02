package MindGame;

//import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.Predicate;

public class labTest006 {

	// String [] p = {"1", "2", "3"};
	// List <?> List1 = new ArrayList<>(Arrays.asList(p));

	public static void main(String[] args) {
		// Deque<Integer> d = new ArrayDeque<>();
//		  dq.push(1);
//		  dq.push(2);       
//		  dq.push(3); 
//		  System.out.println(dq.pollFirst());         
//		  System.out.println(dq.poll());         
//		  System.out.println(dq.pollLast());
		// Deque<Integer> d = new ArrayDeque<>();
//		 dq.push(1);         
//		 dq.push(2);         
//		 dq.push(3);         
//		 System.out.println(dq.remove()); 
//		 System.out.println(dq);
//		 System.out.println(dq.remove());         
//		 System.out.println(dq.remove());
//		 d.push(1);
//		 d.offerLast(2);
//		 d.push(3); 
//		 d.peekFirst();  
//		 d.removeLast(); 
//		 d.pop();        
//		 System.out.println(d);

//		TreeSet<Integer> s = new TreeSet<Integer>();
//		TreeSet<Integer> subs = new TreeSet<Integer>();
//		for (int i = 324; i <= 328; i++) {
//			s.add(i);
//		}
//		subs = (TreeSet) s.subSet(326, true, 328, true);
//		subs.add(329);
//		System.out.println(s + " " + subs);
		
		List<Integer> values = Arrays.asList(2, 4, 6, 9);
		 Predicate<Integer> check = (Integer i) -> {  
			 System.out.println("Checking"); 
			 return i == 4;
			  };
			  Predicate<Integer> even = (Integer i)-> i%2==0;  
			  values.stream().filter(check).filter(even).count(); //4
		 }

	}


