import java.util.HashSet;
import java.util.Set;

public class CustomClassSet {

	public static void main(String[] args) {
		
//		create hashset with custom class
		Set<Student> stdset = new HashSet<>();
		
//		add elements 
		stdset.add(new Student("python", 100));
		stdset.add(new Student("java",200));
		stdset.add(new Student("ruby", 300));
		stdset.add(new Student("C++",400));
//		try to add duplicate 
		stdset.add(new Student("java",200));
		
		
		System.out.println("students are" + stdset);
		
		
		
		

	}

}
