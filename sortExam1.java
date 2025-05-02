package MindGame;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortExam1 {

	public static void main(String[] args) {
//		comparable(new Horse[]{new Horse("BlackHouse", 20), new Horse("WhiteHorse", 30), new Horse("GreHorse", 290)});
//		comparable(Arrays.asList(new Horse("BlackHouse", 20), new Horse("WhiteHorse", 30), new Horse("GreyHorse", 290)));
		
		comparator(new Horse[]{new Horse("BlackHouse", 120), new Horse("WhiteHorse", 30), new Horse("GreyHorse", 290)});

	}

	private static void comparator(Horse[] horsesAge) {
		Comparator<Horse> byAge = Comparator.comparing(horse -> horse.getAge());
		Arrays.sort(horsesAge, byAge);
		System.out.println(Arrays.toString(horsesAge));
		
		
	}

	private static void comparable(List<Horse> HorseList) {
		Collections.sort(HorseList);
		System.out.println("List: " + HorseList);
		
		
	}

	private static void comparable(Horse[] horsesName) {
		
		Arrays.sort(horsesName);
		System.out.println(Arrays.toString(horsesName));
	}

}
