package MindGame;

import java.io.File;

public class fileHandlingInfo {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\vpaul306@emea.comcast.com\\Desktop\\vpfile007throw.txt");
		if(file.exists()) {
			System.out.println("File Name:" + file.getName());
			System.out.println("File Location: " + file.getAbsolutePath());
			System.out.println("File Permission W: " + file.canWrite());
			System.out.println("File Permission R: " + file.canRead());
			
			System.out.println("File Size : " + file.length());
			//System.out.println("File Remove: " + file.delete());
		}else {
			System.out.println(" File Does not Exist");
		}

	}

}
