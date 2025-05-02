package MindGame;

public class LabCompare implements Comparable <Product> {

	private Integer id;
	
	public LabCompare(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Product" + id;
		
	}
	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
