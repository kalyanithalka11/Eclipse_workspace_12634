import java.util.Scanner;

public class IncomeTaxCalc {
	double tax = 0.0;

	public double Tax1(int salary) {
		return tax = 0;
	}

	public double Tax2(int salary) {
		return tax = (salary - 300000) * .05;
	}

	public double Tax3(int salary) {
		return tax = (salary - 700000) * .1 + 20000;
	}

	public double Tax4(int salary) {
		return tax = (salary - 1000000) * .15 + 50000;
	}

	public double Tax5(int salary) {
		return tax = (salary - 1200000) * .2 + 80000;
	}

	public double Tax6(int salary) {
		return tax = (salary - 1500000) * .3 + 140000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncomeTaxCalc calc = new IncomeTaxCalc();

		Scanner in = new Scanner(System.in);

		System.out.println("Enter your Annual Income: ");
		int salary = in.nextInt();

		if (salary <= 300000) {
			calc.Tax1(salary);
		} else if (salary <= 700000) {
			calc.Tax2(salary);
		} else if (salary <= 1000000) {
			calc.Tax3(salary);
		} else if (salary <= 1200000) {
			calc.Tax4(salary);
		} else if (salary <= 1500000) {
			calc.Tax5(salary);
		} else {
			calc.Tax6(salary);
		}
		System.out.println("Tax: " + calc.tax);
	}

}
