package MindGame;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class timeAPILab {

	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		System.out.println(now);
		LocalTime sundaywakeup = LocalTime.of(7, 30).plus(1, ChronoUnit.HOURS);
		System.out.println("Sunday wake up at:" + sundaywakeup);
		
		
		//Leaving at 2024-02-14T13:30Z[GMT]
		//Arriving at 2024-02-14T16:45+01:00[Europe/Zurich]
		//Arriving at 16:45 local time.
		
//		ZoneId zoneEUZurich = ZoneId.of("Europe/Zurich");
//		ZoneId zoneEUDublin = ZoneId.of("GMT");
//		LocalDateTime nowDT = LocalDateTime.now();
//		ZonedDateTime DublinZoneTime = nowDT.atZone(ZoneId.of("Europe/Dublin"));
//		ZonedDateTime ZurichZoneTime = DublinZoneTime.withZoneSameInstant(zoneEUZurich);
//		//System.out.println("Time in Dublin" + DublinZoneTime);
//		//System.out.println("Time in Zurich" + ZurichZoneTime);
//		ZonedDateTime DublinStartTime = LocalDateTime.of(2024, 2, 14, 13,30).atZone(zoneEUDublin);
//		ZonedDateTime ZurichArrivalTime = DublinStartTime.withZoneSameInstant(zoneEUZurich).plus(2, ChronoUnit.HOURS);
//		ZonedDateTime ArrivalLocalDublinTime = LocalTime.of(16, 45).
//		
//		System.out.println("Leaving at: " + DublinStartTime);
//		System.out.println("Arriving at:" + ZurichArrivalTime);
//		System.out.println("Arriving at: ");


	}

}
