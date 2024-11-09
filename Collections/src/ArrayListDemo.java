import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//normal ArrayList (No type safety in normal array list and type casting is mandatory).
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("Kavya");
		a.add(10.5);
		
		System.out.println(a);
		
		
		
		//(<Integer> Genetic syntax) type safety and avoid type casting.
		ArrayList<Integer> al  = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Object obj = al.get(0);
		int i = (Integer)obj; //Type casting is mandatory
		System.out.println(i);
					
		//al.add(10.3);
		System.out.println(al);
		
		
		for(int j : al) {
			System.out.println(j);
		}
		
		//al.add("Kavya");
		
		al.set(0, 100);
		al.add(1, 123);
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove(0);
		al.remove(1);
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		
		al.clear();
		System.out.println(al);
		System.out.println(al.size());
		
		ArrayList<String> courses = new ArrayList<>();
		
		courses.add("Kavya");
		courses.add("Kalyani");
		
		System.out.println(al.size());
		
		


	}

}
