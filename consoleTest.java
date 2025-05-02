package MindGame;

import java.io.Console;
import java.util.Arrays;

public class consoleTest {

	public static void main(String[] args) {
		Console console = System.console();
		if(console==null) {
			System.err.println("Error");
		}else {
			String name = console.readLine("Please provide %s:", "name");
			console.format("Hellow ther %s%n",name);
			console.printf("Welcome.");
			console.writer().println();
			
			char [] pwd = console.readPassword("Password Please%d %d", 3,8);
			char [] pwdagain = console.readPassword("verify password:");
			boolean pwdmatch = Arrays.equals(pwd, pwdagain);
			if(pwdmatch) {
				console.printf("Password Match..");
			}else {
				console.printf("Password did NOT Match..");
			}
		}

	}

}
