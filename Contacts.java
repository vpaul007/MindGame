package MindGame;

public class Contacts {

	private int age;
	private String name;
	
	
	public Contacts(String name, int age) {
		this.age = age;
		this.name = name;
		
	}

	@Override
	public int hashCode() {
		
		int hash = 7;
		hash = 89 * hash + this.age;
		hash = 89 * hash + this.name.length();
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Contacts) {
			Contacts otherContact = (Contacts) obj;
			return this.name.equals(otherContact.name) && this.age == otherContact.age;
		}
		return false;
	}
	@Override
	public String toString(){
		
		return name + "..." + age;
	}

}
