package MindGame;

import java.util.Map;
import java.util.TreeMap;

public class LabMaps {

	
	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("VP", 40);
		map.put("VP", 5);
		map.put("RK", 41);
		map.put("HB", 6);
		System.out.println(map.containsKey("VP")); //true
		System.out.println(map.containsValue(6)); //true
		System.out.println(map); //map
		System.out.println(map.isEmpty());//false
		System.out.println(map.get("HB")); //value
		for(String name:map.keySet()) {
			System.out.println(name); //names
		}
		
		for(Integer age:map.values()) {
			System.out.println(age);
		}
		System.out.println(map.size()); //size of map
		map.clear();
		System.out.println(map);
		
		//Again put values
		map.put("VP", 49);
		map.put("VP", 5);
		map.put("RK", 39);
		map.put("HB", 7);
		map.forEach((k, v) -> System.out.println(k + " maps to -> " + v));

	}

}
