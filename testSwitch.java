package MindGame;

public class testSwitch {

	public  int process(int number, String day) {
		int value =0;
		switch(day) {
		case "Monday":
			value =1;
			break;
		case "Tesday":
		case "Wedns":
		case "Thurs":
			value = 2;
			break;
		case "Friday":
			value=3;
			break;
		case "Sat":
		case "Sunday":
			value=0;
			break;
			default:
			value=-1;
			
		}
		return value+number;
	} 
	public static void main(String[] args) {
		testSwitch e = new testSwitch();
		int result = e.process(-1, "Thurs");
		System.out.println(result);
		

	}
	
}
