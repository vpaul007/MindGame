package MindGame;

import java.util.HashMap;
import java.util.Map;

 public class testLab02 {

	public static void main(String[] args) {
		Map<ToDo, String> m = new HashMap<ToDo, String>();
		ToDo t1 = new ToDo("Monday");
		ToDo t2 = new ToDo("Tuesday");
		ToDo t3 = new ToDo("Wednesday");
		m.put(t1, "Hello Monday");
		m.put(t2, "Hello Tuesday");
		m.put(t3, "Hello Wednesday");
		System.out.println(m.size());
		


	}}

//   class ToDo{
//	  String day;
//	  ToDo(String d){
//		  this.day = d;
//		 
//	  }
//	  
//	  public boolean equals(Object o) {
//		  return ((ToDo)o).day.equals(this.day);
//	  }
//	  public int hashCode() {
//		  return 9;}
//	  
//  }
//}
