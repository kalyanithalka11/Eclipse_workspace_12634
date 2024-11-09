import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
/*
 * In HashSet we cannot add or remove elements from particular index
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
		s.add(100); //Stores the elements based on their HashCode
		s.add(200);
		s.add(300);
		s.add(400);
		s.add(500);
		
		s.add(100);//HashSet wont maintain the duplicate eliments
		System.out.println(s);
		
		s.add(null);//HashSet Accepts only 1 null value
		System.out.println(s);
		
		boolean existed = s.contains(100);
		System.out.println(existed);
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.remove(100));	
		System.out.println(s);
		
		s.addFirst(111);
		s.addLast(999);
		System.out.println(s);
		
		s.removeFirst();
		s.removeLast();
		System.out.println(s);
		

		
		
		
	}

}
