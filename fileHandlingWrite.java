package MindGame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class fileHandlingWrite {
  
	//To write a file
	public static void main(String[] args) {
		//file creation using FileWriter
		try {
			FileWriter file = new FileWriter("C:\\Users\\vpaul306@emea.comcast.com\\Desktop\\vpcreate002.txt");
			//This is for write
			try {
				file.write("*********My Name is VP*********");
			}finally{
				file.close();
			}
			System.out.println("Data is written successfully");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//BufferedWriter file1 = new BufferedWriter("C:\\Users\\vpaul306@emea.comcast.com\\Desktop\\vpcreate003.txt");
		
		
		

	}

}
