import java.util.Arrays;
import java.util.Collections;
import java.util.compa
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(44,55,66,99,88);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		int index = Collections.binarySearch(list,  99);
		System.out.println(index);
	}
	//collections Vs Collection Vs Collections?
	//Collection - Collection is an Interface in Java, used to represent a single unit with a group of individual Objects.
	//Collections - Collections is an utility class in Java, used to Operate Collection with several utility methods.

}
