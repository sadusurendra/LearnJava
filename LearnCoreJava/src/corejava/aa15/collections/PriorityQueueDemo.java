package corejava.aa15.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<Integer>();
		System.out.println(pq.peek());
		
		for(int i=20;i<=30;i++) {
			pq.offer(i);
		}
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		
		System.out.println(pq);
		
	}

}
