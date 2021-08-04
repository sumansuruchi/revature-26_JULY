package priorityqueue;
import java.util.*;



public class Pq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<String> queue=new PriorityQueue<String>();  
		
		queue.add("Suruchi");
		queue.add("Garima");
		queue.add("Lasha");
		queue.add("Aaru");
		queue.add("Chand");
		
		System.out.println("Priority Queue : " +queue);
		System.out.println("First Element using queue.element(): " +queue.element());
		System.out.println("First Element using queue.peek(): " +queue.peek());
		queue.remove();
		queue.poll();
		System.out.println("Printing after removing Queue element using queue.remove() & queue.poll() :" +queue);
		
		Iterator<String> i = queue.iterator();
		System.out.print("Printing queue with Iterator : ");
		while(i.hasNext()) {
			System.out.print(i.next()+ " ");
		}
	
	}

}


	
