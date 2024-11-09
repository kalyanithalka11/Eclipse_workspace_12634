
public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Kalyani", "Kalyani@gmail.com", 9121831652l);
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentEmail());
		System.out.println(s1.getStudentMobile());
		
		System.out.println("----------------------------------------------------");
		
		Student s2 = new Student();
		s2.setStudentId(102);
		s2.setStudentName("Kavya");
		s2.setStudentEmail("kavyathalka@gmail.com");
		s2.setStudentMobile(9390757127l);
		
		System.out.println(s2.getStudentId());
		System.out.println(s2.getStudentName());
		System.out.println(s2.getStudentEmail());
		System.out.println(s2.getStudentMobile());
		
		
	}

}
