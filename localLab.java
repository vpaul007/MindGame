package MindGame;

import java.text.NumberFormat;
import java.util.Locale;

public class localLab {

	public static void main(String[] args) {
		Locale local = Locale.getDefault();
		System.out.println(local); //Language_Country en_IE

		//Constructor way
		System.out.println(new Locale ("en"));
		Locale localUK = new Locale("en", "GB");
		System.out.println(localUK.getDisplayCountry());
		System.out.println(localUK.getDisplayLanguage());
		
		//Build-in Constant
		System.out.println(Locale.FRENCH);
		Locale localFR = Locale.FRANCE;
		System.out.println(localFR.getDisplayCountry());
		System.out.println(localFR.getDisplayLanguage());
		
		//Builder
		Locale localInd = new Locale.Builder()
				.setLanguage("hn")
				.setRegion("IN").build();
		System.out.println(localInd);
		
		formatNumbers();
		formatCurrencies();
				
				
	}

	private static void formatCurrencies() {
		double n = 9897987_11;
		System.out.println(NumberFormat.getInstance().format(n));
		
	}

	private static void formatNumbers() {
		// TODO Auto-generated method stub
		
	}

}
