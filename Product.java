package MindGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comparable();

	}

	public static void comparable() {
		List<LabCompare> products = new ArrayList<LabCompare>();
		products.add(new LabCompare(10));
		products.add(new LabCompare(50));
		products.add(new LabCompare(60));
		products.add(new LabCompare(100));
		Collections.sort(products);
		System.out.println(products);
		
	}
}
