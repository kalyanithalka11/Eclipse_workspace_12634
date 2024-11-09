import java.util.ArrayDeque;
import java.util.PriorityQueue;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q = new PriorityQueue<>();
		q.offer("Java");
		q.offer("Python");
		q.offer("Angular");
		q.offer("Spring");
		System.out.println(q);
		
		q.poll();
		System.out.println(q);
		
		q.add("React");
		System.out.println(q);
		
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		dq.add(100);
		dq.add(500);
		dq.add(200);
		System.out.println(dq);
		
		dq.addFirst(300);
		dq.addLast(100);
		System.out.println(dq);
		
		//dq.push(101);
		//dq.push(202);
		System.out.println(dq);
		
		dq.remove(100);
		System.out.println(dq);
		
		dq.pop();
		System.out.println(dq);
	
		
	}

}
