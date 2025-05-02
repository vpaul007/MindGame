package MindGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class fileHandlingtest {

	 public static void main(String[] args) throws Exception {
		 File f = new File("x");   //1
		 BufferedReader bfr1 = new BufferedReader(new FileReader(f)); //2
		 BufferedReader bfr2 = new BufferedReader( bfr1 ); //3 
		// PrintWriter pw = new PrintWriter(new FileReader(f)); //4   
		 } 
	 }
	 
