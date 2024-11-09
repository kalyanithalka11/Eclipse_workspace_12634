import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Predicate;

public class StreamApiDemo {

	public static void main(String[] args) {
		List<Double> salaries = Arrays.asList(55000.0, 45000.0, 35000.0, 65000.0);
		System.out.println(salaries);
		System.out.println("-----filter salaries > 40000---------");
		Stream<Double> stream = salaries.stream();
		
		Predicate<Double> predicate = (value) -> value >= 40000;
		stream
			.filter(predicate)
			.forEach(System.out :: println);
		System.out.println("-----filter salaries < 50000---------");
		salaries
			.stream()
			.filter((salary) -> salary < 50000)
			.forEach(System.out :: println);
		
		List<String> courses = Arrays.asList("Python", "Java", "Angular", "React", "JS");
		
		System.out.println("------Filter course names starts with j -----------------");
		
		System.out.println(courses);
		Stream<String> stream1 = courses.stream();
		courses
			.stream()
			.filter((course)-> course.startsWith("J"))
			.forEach(System.out :: println);
			
		System.out.println("------filter courses where course length is >= 5 characters");
		courses
			.stream()
			.filter((course)-> course.length() >= 5)
			.forEach(System.out :: println);
		System.out.println("----------Update each salary by 2k-----------------");
		salaries
			.stream()
			.map((salary)->salary+2000)
			.forEach(System.out :: println);
		System.out.println("---------update each salary by 10% and display updated salaries----------");
		salaries
			.stream()
			.map((salary)-> salary + salary * .1)
			.forEach(System.out :: println);
		
		System.out.println("----------Display sum of salaries------------------------");
		double sal = 0;
		for(Double  salary : salaries) {
			sal = sal + salary;
		}
		System.out.println(sal);
		
		System.out.println("------(OR)-------------");
		
	}Double totalSalary = salaries
			.stream()
			.

}
