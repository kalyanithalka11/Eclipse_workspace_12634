import java.util.Scanner;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Employee Id: ");
		int id = in.nextInt();
		System.out.println("Employee Name: ");
		String name = in.next();
		System.out.println("Employee Salary: ");
		double basic = in.nextInt();
		
		double hra = 0.15 * basic;
		double pf = 0.05 * basic;
		double ta = 0.02 * basic;
		double esi = 0.025 * basic;
		double pt = 200;
		
		double gross_pay = basic + hra + pf + ta + esi + pt;
		double net_pay = gross_pay - (pf + pt);
				
		System.out.println("EmployeeId: "+id);
		System.out.println("EmployeeName: "+name);
		System.out.println("BasicSalary: "+basic);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf); 
		System.out.println("TA: "+ta);
		System.out.println("ESI: "+esi);
		System.out.println("PT: "+pt);
		
		System.out.println("GrossPay: "+gross_pay);
		System.out.println("NetPay: "+net_pay);
		
	}

}
