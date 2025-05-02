package MindGame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandlingcopytextfile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//copytextfile(false);
		
	}
	
	public static void copytextfile(boolean buffering) throws FileNotFoundException, IOException {
		File source = new File("C:\\Users\\vpaul306@emea.comcast.com\\Desktop\\vpcreate002.txt");
		File destination = new File("C:\\Users\\vpaul306@emea.comcast.com\\Desktop\\vpcopy002.txt");
		
		try(var read = new BufferedReader(new FileReader(source));
			var write = new BufferedWriter(new FileWriter(destination))){
			
			if(buffering) {
				String str = null;
				while((str = read.readLine()) !=null) {
					write.write(str);
				}
			}else {
				int b;
				while((b=read.read())!=-1) {
					write.write(b);
				}
			}
			
		}
	}

}
