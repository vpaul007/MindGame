package MindGame;

import java.util.Objects;

public class Dog implements Comparable<Dog>{
	
	private String name;
	private Integer age;
	

	public Dog(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(age, other.age) && Objects.equals(name, other.name);
	}

@Override
public int compareTo(Dog o) {
	// TODO Auto-generated method stub
	return 0;
}


	

}
