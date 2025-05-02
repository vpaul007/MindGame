package MindGame;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class AgeLablocale {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		LocalDate eighteenYears = now.minus(18, ChronoUnit.YEARS);
		
		System.out.println(eighteenYears);
		
		LocalDate VP1Birthday = LocalDate.of(1984, Month.SEPTEMBER, 7);
		LocalDate RKBirthday = LocalDate.of(1983, Month.APRIL, 12);
		LocalDate HKBirthday = LocalDate.of(2019, 1, 21);
		System.out.println("Eligble to Drink as born before : " + eighteenYears);
		System.out.println("VP Date of Birth is  :" + VP1Birthday);
		
		if (VP1Birthday.isBefore(eighteenYears)) {
			System.out.println("Yes VP can consume alcohol");
			
		}else {
			System.out.println("No, VP not allowed to consume alcohol");
		}
		System.out.println("RK DOB is" + RKBirthday );
		if(RKBirthday.isBefore(eighteenYears)) {
			System.out.println("Yes RK can consume alcohol");
			
		}else {
			System.out.println("No RK can consume alcohol");
		
		}
		
		System.out.println("HK DOB" + HKBirthday);
		if(HKBirthday.isBefore(eighteenYears)) {
			System.out.println("Yes HK can consume alcohol");
		}else {
			System.out.println("No HK can consume alcohol");
		}
	}

}
