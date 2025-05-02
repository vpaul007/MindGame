package MindGame;

import java.nio.file.Path;
import java.nio.file.Paths;

public class labPath {

	public static void main(String[] args) {
//		Path p1 = Path.of("C:\\Users\\vpaul306@emea.comcast.com\\Desktop\\vpcreate002.txt");
//		Path p2 = Path.of("Users/vpaul306@emea.comcast.com/Desktop/vpcreate002.txt");
//		Path P3 = Path.of("C:","Users","vpaul306@emea.comcast.com","Desktop","vpcreate002.txt"); 
		
//		 Path p1 = Paths.get("c:\\temp\\test.txt");
//		 Path p2 = Paths.get("c:\\temp\\report.pdf"); 
//		 System.out.println(p1.resolve(p2));

		 Path p1 = Paths.get("\\photos\\vacation");
		 Path p2 = Paths.get("\\yellowstone"); 
		 System.out.println(p1.resolve(p2)+"  "+p1.relativize(p2));
	}

}
