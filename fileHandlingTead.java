package MindGame;

import java.io.FileReader;
import java.io.IOException;

public class fileHandlingTead {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("C:\\Users\\vpaul306@emea.comcast.com\\Desktop\\vpcreate002.txt");
			
			try {
				int i;
				while((i=file.read())!=-1){
					System.out.print((char)i);
				}
			}finally {
				file.close();
			}
			
		}
		catch(IOException e) {
			System.out.println("File not Found");
			
		}
		
		

	}

}
