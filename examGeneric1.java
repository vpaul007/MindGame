package MindGame;

public class examGeneric1 {

	public static void main(String[] args) {
		String name = "Dr. Joe Blog";
		System.out.println(check(name,s ->s.startWith("Dr.")));
		Integer i = -4;
		System.out.println(check(i,n -> n>0));

	}

}
