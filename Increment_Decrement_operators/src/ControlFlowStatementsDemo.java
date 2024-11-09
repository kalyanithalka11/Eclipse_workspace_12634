import java.util.Scanner;
public class ControlFlowStatementsDemo {
	public static boolean isEven(int num){
		boolean status = false;
		if (num%2 == 0) {
			status = true;
		}
		return status;
	}
	public static void findEvenOrOdd(int num) {
		if(isEven(num)){
			System.out.println(num+ " is Even.");
		}
		else {
			System.out.println(num+" is Odd.");
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("ENter a num: ");
		int num1 = in.nextInt();
		
		System.out.println("ENter a num: ");
		int num2 = in.nextInt();
		findEvenOrOdd(num1);
		findEvenOrOdd(num2);
		
	}

}
