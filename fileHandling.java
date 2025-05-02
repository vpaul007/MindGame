package MindGame;

import java.io.File;
import java.io.IOException;

public class fileHandling {

	public static void main(String[] args) throws IOException {
//		File file = new File("C:\\Users\\vpaul306@emea.comcast.com\\Desktop\\vpfile007.txt");
//	//With Try Catch	
//		try {
//		if(file.createNewFile()) {
//			System.out.println("New File created");
//		}else {
//			System.out.println("File already Exist");
//		}
//
//	}catch(IOException i) {
//		System.out.println(i);
//	}
//
//}}

		//With Throws
		File file = new File("C:\\Users\\vpaul306@emea.comcast.com\\Desktop\\vpfile007throw.txt");
		
		if(file.createNewFile()) {
			System.out.println("New File created");
		}else {
			System.out.println("File already Exist");
		}}}