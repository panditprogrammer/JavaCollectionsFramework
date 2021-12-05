import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAndPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/* queue interface and linkedlist 
		 * create queue using linkedlist 
		 */
				Queue<Integer> queue = new LinkedList<>();
				queue.offer(33);
				queue.offer(11);
				queue.offer(55);
				queue.offer(99);
				System.out.println("queue is " + queue);
				
//				// remove element from queue
//				System.out.println("queue poll "+ queue.poll());
//				
//				// next in queue (head of queue)
//				System.out.println("head of queue " + queue.peek());
//				
//				System.out.println(queue);
//				
				
				
				/* priorityQueue 
				 * all operations
				 */
				
				Queue<Integer> pq = new PriorityQueue<>();
//				Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
				
//				add in queue 
				pq.offer(34);
				pq.offer(44);
				pq.offer(332);
				pq.offer(623);
				pq.offer(233);
				
				System.out.println("priority queue- " + pq);
				
				// remove elements
				System.out.println("poll function returns- " + pq.poll());
				
				// peek value of priority queue
				System.out.println("peek value of priority queue- " + pq.peek());
				
				
				System.out.println("priority queue- " + pq);
				
				
				
	}

}
