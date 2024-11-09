import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.add("Kavya");
		s.add("Kalyani");
		s.add("Sony");
		s.add("Navya");
		s.add("mansa");
		System.out.println(s);
		
		System.out.println(s.peek()); //prints the last element from the list
		
		s.pop(); //removes the last element from the list
		System.out.println(s);
	}

}
