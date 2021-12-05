import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassJava {

	public static void main(String[] args) {

		List<Integer> ar = new ArrayList<>();

//		add elements
		ar.add(43);
		ar.add(55);
		ar.add(73);
		ar.add(33);
		ar.add(89);
		ar.add(66);

//		System.out.println(ar);

//		collection class function
		// get minimum
//		System.out.println("min is " + Collections.min(ar));
		// get maximum
//		System.out.println("max is " + Collections.max(ar));
		// get frequency
//		System.out.println("freq is " +Collections.frequency(ar, 33));

		// sort the list
//		Collections.sort(ar);
		// reverse the order
		// Collections.sort(ar,Comparator.reverseOrder());
//		System.out.println(ar);

		
		
	
		
		
		/* -------------------------------------------
		 * sort the custom class list and compare
		 */

		List<Student> std = new ArrayList<>();

		std.add(new Student("rahul", 33));
		std.add(new Student("ruby", 22));
		std.add(new Student("deepak", 66));
		std.add(new Student("programmer", 88));
		std.add(new Student("me", 44));

		System.out.println(std);

//		Student s = new Student("rahul", 33);
//		Student s1 = new Student("deepak", 66);
////		compare Student object 
//		System.out.println(s.compareTo(s1));
//
//		sort the students list
//		Collections.sort(std);

		
		
		// sort the student list on the basis of their name
		Collections.sort(std, new Comparator<Student>() {
			
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
				
			}
			
		});

		System.out.println(std);

	}

}
