import java.util.Arrays;

public class ArrayClassJava {

	public static void main(String[] args) {
		
//		array 
		Integer[] marks = {43, 23, 94, 77, 82, 34, 9};
		
		// sort the array
		Arrays.sort(marks);
		
		// fill the values 
		Arrays.fill(marks, 0);
		
		for(int i : marks) {
			System.out.println("marks is " + i);
		}

	}

}
