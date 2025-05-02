package MindGame;

import java.util.Comparator;
import java.util.Objects;

public class Horse {
	
	private String name;
	private Integer age;
	
	public Horse(String name, Integer age) {
		this.age=age;
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Horse [name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Horse otherHorse = (Horse) obj;
//		return Objects.equals(age, otherHorse.age) && Objects.equals(name, otherHorse.name);
//	}


//	@Override
//	public int compareTo(Horse otherHorse) {
//		
//		return name.compareTo(otherHorse.getName());
//	}

}
