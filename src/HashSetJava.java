import java.util.HashSet;
import java.util.Set;

public class HashSetJava {

	public static void main(String[] args) {
		
//		create Hash set
		Set<Integer> set = new HashSet<>();
		
		// add elements 
		set.add(33);
		set.add(77);
		set.add(55);
		set.add(88);
		// duplicate not allowed
		set.add(88);  
		set.add(93);
		set.add(22);
		
		System.out.println("HashSet is "+ set);
		
		// remove element 
		set.remove(93);
		
		// check element
		System.out.println(set.contains(55));
		
		//check set empty
		System.out.println(set.isEmpty());
		
		// get the current size of set (number of elements) 
		System.out.println(set.size());
		
		// remove all elements
		set.clear();
		
		System.out.println("HashSet is "+ set);
	}

}
