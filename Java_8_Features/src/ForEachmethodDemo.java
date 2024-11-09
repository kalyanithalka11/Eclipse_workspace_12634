import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class ForEachmethodDemo {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java", "Python", "Angular", "React");
		
		Consumer<String> consumer = (value) -> System.out.println(value);
		courses.forEach(consumer);
		
		System.out.println("-----------Passing Lambda Expression------------------------");
		
		courses.forEach((value) -> System.out.println(value));
		
		System.out.println("-----------Passing Method References------------------------");
		
		courses.forEach(System.out :: println);
		
		System.out.println("------------------------------------------------------------");
		
		List<Double> salaries = Arrays.asList(55000.0, 45000.0, 30000.0, 65000.0);
		Consumer<Double> consumer1 = (salary) -> System.out.println(salary);
		salaries.forEach(consumer1);
		
		/*System.out.println("------------------------------------------------------------");

		
		salaries.forEach((salary) -> System.out.println(salary));
		
		System.out.println("------------------------------------------------------------");

		
		salaries.forEach(System.out :: println);*/
		
		List<Double> filteredSalaries = new ArrayList<Double>();
		salaries.forEach((salary)->{
			if(salary>40000.0) {
				filteredSalaries.add(salary);
			}
		});
		for(Double salary : salaries) {
			if(salary >= 40000) {
				filteredSalaries.add(salary);
			}
		}
		
		
	}

}
