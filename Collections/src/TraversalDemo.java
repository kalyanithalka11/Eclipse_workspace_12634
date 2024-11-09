import java.util.ArrayList;
import java.util.ListIterator;

public class TraversalDemo {

	public static void main(String[] args) {
		ArrayList<Double> salaries = new ArrayList<>();
		salaries.add(20000.00);
		salaries.add(25000.00);
		salaries.add(30000.00);
		salaries.add(40000.00);
		salaries.add(60000.0);
		salaries.add(75000.00);
		System.out.println(salaries);
		
		System.out.println("Using for loop");
		for(int index = 0; index<salaries.size(); index++) {
			System.out.println(salaries.get(index));
		}
		System.out.println("Using ListIterator");
		ListIterator<Double> itr = salaries.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()); 
		}
		
		System.out.println("Using forEach() from v1.8 with Method references");
		salaries.forEach(System.out::println);
		
		System.out.println("Using forEach() from v1.8 with Lambda Expression");
		salaries.forEach((salary)->System.out.println(salary));
		
	}

}
