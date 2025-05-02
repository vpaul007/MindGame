package MindGame;

public class LabEquals {
	private int fooValue;
	

	public LabEquals(int val) {
		fooValue = val;
	}
	int getfooValue() {
		return fooValue;
	}

	@Override
	public boolean equals(Object o) {
		if((o instanceof LabEquals) && (((LabEquals)o).getfooValue() == this.fooValue)) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		LabEquals f1 = new LabEquals(2);
		LabEquals f2 = new LabEquals(2);
		System.out.println(f1.equals(f2));

	}

}
