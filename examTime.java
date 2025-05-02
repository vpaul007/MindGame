package MindGame;

import java.time.Duration;
import java.time.Period;

public class examTime {

	public static void main(String[] args) {
//		Duration d = Duration.ofMillis(1100);
//		System.out.println(d);
//		d = Duration.ofSeconds(61);
//		System.out.println(d);
		
		Duration d = Duration.ofDays(1);
		System.out.println(d);
		d = Duration.ofMinutes(0);
		System.out.println(d); 
		Period p = Period.ofMonths(0);
		System.out.println(p);

	}

}
