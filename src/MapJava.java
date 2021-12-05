import java.util.HashMap;
import java.util.Map;

public class MapJava {

	public static void main(String[] args) {

		Map<String, Integer> mapping = new HashMap<>();

		// add the elements
		mapping.put("python", 2000);
		mapping.put("java", 5300);
		mapping.put("php", 3200);
		mapping.put("html", 1000);
		mapping.put("c", 3000);

		// overwrite the existing
		mapping.put("java", 5000);

		System.out.println(mapping);

		// check key in map
		System.out.println(mapping.containsKey("php"));

		// check value in map
		System.out.println(mapping.containsValue(5000));

		// if key not exist
		mapping.putIfAbsent("html", 2300);

		// remove element
				mapping.remove("c");
		
		// iterator in map
//		for (Map.Entry<String, Integer> e : mapping.entrySet()) {

//			// get all keys and values
//			System.out.println("map entry " + e);

//			// get all keys
//			System.out.println("key is " + e.getKey());
//			// get all values
//			System.out.println("value is " + e.getValue());

//		}
		
		// iterate all keys
//		for(String k: mapping.keySet()) {
//			
//			System.out.println(k);
//		}

//		// iterate all values
//		for(int v: mapping.values()) {
//			System.out.println(v);
//		}


		System.out.println(mapping);

	}

}
