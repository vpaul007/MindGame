package MindGame;

//public class TestClass {
//	public static void main(String args[] )    {  
//		Outer out = new Outer();
//		System.out.println(out.getInner().getOi());   
//		}
//	} 
//class Outer { 
//	private int oi = 20;
//	class Inner    { 
//		int getOi() {
//			return oi;
//			}   
//		}    
//	Inner getInner() {
//		return new Inner() ;
//		}
//	}
//class A {
//	
//}
//public class TestClass {
//	public class A    {
//		public void m() { }
//		}   
//	class B extends A    {
//		
//	} 
//	
//	public static void main(String args[])    {
//	   
//	   new TestClass().new A() { 
//		   public void m() { } };
//		   }
//   }


//public class TestClass extends Thread
//{
//    class Runner implements Runnable
//    {
//        public void run()
//        {
//            Thread[] t = new Thread[5];
//            for(int i=0; i<t.length; i++) System.out.println(t[i]);
//        }
//    }
//    
//   public static void main(String args[]) throws Exception
//   {
//            TestClass tc = new TestClass();
//            new Thread( tc.new Runner() ).start();
//   }
//}
import java.io.*; public class TestClass {
	public static void main(String[] args)  throws Exception    
	{       FileWriter fw = new FileWriter("text.txt"); 
//	fw.write("hello"); 
	fw.close();    } 
	}

