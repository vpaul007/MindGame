package MindGame;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingDogs {

	public static void main(String[] args) {
		
		comparable(new Dog[] {new Dog("Brown", 1), new Dog("Toad", 10), new Dog("Black", 20)});
		comparable(Arrays.asList(new Dog("Brown", 1), new Dog("Toad", 10), new Dog("Black", 20)));

	}

	public static void comparable(Dog[] dogArray) {
		Arrays.sort(dogArray);  ///Array sort 
		System.out.println(Arrays.toString(dogArray));
		
	}
	
//	public static void comparable(List<Dog> dogList) {
//		Collections.sort(dogList);
//		System.out.println(Arrays.toString(dogList);
//		
	}


