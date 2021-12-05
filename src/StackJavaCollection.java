import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackJavaCollection {

	public static void main(String[] args) {
		// create stack
		Stack<String> students = new Stack<>();
		
		// push in stack 
		students.push("shruti");
		students.push("shubham");
		students.push("developer");
		students.push("python");
		students.push("ruby");
		System.out.println("stack is "+ students);
		
		// pop from stack
		String s = students.pop();
		System.out.println("pop value is " + s);
//		pick of stack
		System.out.println("pick value is " + students.peek());
		
		System.out.println(students);
//		
	

	}

}
