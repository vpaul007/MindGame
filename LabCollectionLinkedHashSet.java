package MindGame;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LabCollectionLinkedHashSet {

	/*
	 * This defines an iteration order in which the elements were inserted into the set
	 */
	public static void main(String[] args) {
		
		Set<Contacts> contactLHS = new LinkedHashSet<>();
		contactLHS.add(new Contacts("VP" , 40));
		contactLHS.add(new Contacts("RK" , 30));
		contactLHS.add(new Contacts("RK" , 31));
		contactLHS.add(new Contacts("HB" , 20));
		contactLHS.add(new Contacts("Kush" , 6));
		contactLHS.add(new Contacts("Kush" , 6));
		contactLHS.add(new Contacts("VP" , 44));
		
		for (Contacts contact:contactLHS) {
			System.out.println(contact);

	}


	}

}
