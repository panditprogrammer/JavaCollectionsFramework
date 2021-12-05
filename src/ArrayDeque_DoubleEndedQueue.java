import java.util.ArrayDeque;

public class ArrayDeque_DoubleEndedQueue {

	public static void main(String[] args) {
		
//		create arraydeque
		ArrayDeque<Integer> arraydeque = new ArrayDeque<>();
		
//		add elements in array deque
		arraydeque.offer(23);
		arraydeque.offer(53);
		arraydeque.offer(83);
		arraydeque.offer(93);
		arraydeque.offer(82);
		
		System.out.println("array Deque is " + arraydeque);
		
////		add elements at first
//		arraydeque.offerFirst(100);
//		
////		add elements at last 
//		arraydeque.offerLast(500);
//		
////		access first element
//		System.out.println(arraydeque.peek());
//		
////		access first element
//		System.out.println(arraydeque.peekFirst());
//		
////		access last element
//		System.out.println(arraydeque.peekLast());
		
//		remove first element
		System.out.println(arraydeque.poll());
		
//		remove first element
		System.out.println(arraydeque.pollFirst());
		
//		remove last element
		System.out.println(arraydeque.pollLast());
		
		System.out.println("array Deque is " + arraydeque);
		
		
		
	}

}
