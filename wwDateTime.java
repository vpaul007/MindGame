package MindGame;

import java.time.LocalDate;

public class wwDateTime {

	public static void main(String[] args) {
		LocalDate StartWW2 = LocalDate.of(1939, 9, 1);
		LocalDate EndWW2 = LocalDate.of(1945, 9, 2);
		System.out.println("WW2 start on:" + StartWW2.getDayOfWeek());
		System.out.println("WW2 End on:" + EndWW2.getDayOfWeek());

	}

}
