package MindGame;

import java.util.HashSet;
import java.util.Set;

public class LabCollectionHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Contacts> contactHS = new HashSet<>();
		contactHS.add(new Contacts("VP" , 40));
		contactHS.add(new Contacts("RK" , 30));
		contactHS.add(new Contacts("RK" , 31));
		contactHS.add(new Contacts("HB" , 20));
		contactHS.add(new Contacts("Kush" , 6));
		contactHS.add(new Contacts("Kush" , 6));
		contactHS.add(new Contacts("VP" , 44));
		
		for (Contacts contact:contactHS) {
			System.out.println(contact);

	}


	}

}
