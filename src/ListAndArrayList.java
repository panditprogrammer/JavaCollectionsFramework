import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListAndArrayList {

	public static void main(String[] args) {
		
		// create array list (dynamics array)
		ArrayList<String> studentsName = new ArrayList<>();
		
		// add items in array list
		studentsName.add("anjali");
		studentsName.add("rakesh");
		studentsName.add("shubham");
		
//		System.out.println(studentsName);
		
		// adding another arraylist to arraylist
		ArrayList<String> boys = new ArrayList<>();
		boys.add("alan");
		boys.add("mack");
		boys.add("angela");
		
		studentsName.addAll(boys);
//		System.out.println(studentsName);
		
		
		// list class 
		List<Integer> list = new ArrayList();
		
		// add the elements
		list.add(10);
		list.add(20);
		list.add(30);
		
		// add the elements with index
		list.add(2,50);
		
		System.out.println("list is "+ list);
	
		
//		//remove the elements  with index
//		list.remove(2);
//		// remove the elements with value
//		list.remove(Integer.valueOf(30));
//		
//		System.out.println(list.get(0));
//		
//		// remove the all elements form list
//		list.clear();
		
//		update the list element
		list.set(1, 100);
		
//		checking list elements is exist in list
		System.out.println(list.contains(50));
		
//		list iterating  	get the elements
//		for(int i = 0; i <list.size(); i++) {
//			System.out.println("list element is " + list.get(i));
//		}

		
//		for(Integer i: list) {
//			System.out.println("for each " + i);
//		}
		
//		list iterator class
		Iterator<Integer> iter = list.iterator();
		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		System.out.println(list);
		
		/*
		 * list using linked list
		 */
		
		List<String> list1 = new LinkedList<>();
		
		list1.add("python");
		list1.add("java");
		list1.add("javascript");
		list1.add("php");
		System.out.println("linkedList is " + list1);
		
		// update linked list
		list1.set(2, "javascript ES6");
		
		
		//remove the elements  with index
		System.out.println("removed element is - " + list1.remove(1));
		
		System.out.println("list1 element 0 is - " + list1.get(0));
		
		// remove the all elements form linkedlist
		list1.clear();
		
		System.out.println("linkedList is - " + list1);
		
		

	}

}
