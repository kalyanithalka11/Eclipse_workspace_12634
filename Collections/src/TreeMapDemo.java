import java.util.HashMap;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;
import java.util.Map;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1001, "kavya@gmail.com");
		hm.put(1002, "kalyani@gmail.com");
		hm.put(1003, "Yashwanth");
		hm.put(1004, "Sony@gmail.com");
		hm.put(1005, "Navya@gmail.com");
		System.out.println(hm);//The elements will be stored based on the HashCode value
		
		hm.put(1002, "yash@gmail.com");//Duplcate keys are not allowed but duplicate values are allowed.
		System.out.println(hm);
		
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		
		Collection<String> values = hm.values();
		System.out.println(values);
		
		for(Map.Entry<Integer, String> entry : hm.entrySet())
		{
			System.out.println(entry);
			System.out.println(entry.getKey()+"-------"+entry.getValue());
		}
		
		hm.putAll(hm);
		System.out.println(hm);
	}

}
