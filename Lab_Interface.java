package MindGame;


interface I1{
	default int m() {return 1;}
}

interface I2{
	default int m() {return 2;}
}


public class Lab_Interface implements I1, I2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lab_Interface().go();
		

	}
	
	void go() {
		System.out.println(m());
	}

	@Override
	public int m() {
		// TODO Auto-generated method stub
		return 3;
	}

}
