package MindGame;

import java.util.Set;
import java.util.TreeSet;

public class LabCollectionTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set is unique and unordered
		Set<String> treeset = new TreeSet<>();
		treeset.add("VP");
		treeset.add("RK");
		treeset.add("HB");
		treeset.add("Kush");
		treeset.add("VP");
		System.out.println(treeset); //Elements sorted alpha
		
		Set<Integer> treenumber = new TreeSet<>();
		treenumber.add(2);
		treenumber.add(41);
		treenumber.add(20);
		treenumber.add(20); 
		System.out.println(treenumber); //No duplicate and sorted numerically
		

	}

}
