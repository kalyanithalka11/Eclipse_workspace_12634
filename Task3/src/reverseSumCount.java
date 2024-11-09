import java.util.Scanner;

public class reverseSumCount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseSumCountApp rsc = new reverseSumCountApp();

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		
		int option = 0;
	do {
		System.out.println("Sum, Reverse and Count of numbers.");
		System.out.println("------------------------------------------");
		System.out.println("1. Sum");
		System.out.println("2. Reverse");
		System.out.println("3. Count");
		System.out.println("Choose one option.");
		option = in.nextInt();
	
	 switch(option) {
	 case 1:
		 rsc.sum(num);
		 
		 break;
	 case 2:
		 rsc.reverse(num);
		 break;
	 case 3:
		 rsc.count(num);
		 break;
	 case 4:
		 System.out.println("Select a valid option");
	 }
	 
	}while(option != 0);
	}

}
