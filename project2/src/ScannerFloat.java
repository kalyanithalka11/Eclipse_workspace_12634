import java.util.Scanner;
public class ScannerFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1, num2, sum;  //variable declaration
		num1=num2=sum=0;	//variable initialization 
		
		//Object creation
		Scanner in = new Scanner(System.in);
		
		//Reading 2 numbers from user
		System.out.println("Enter first num: ");
		num1 = in.nextFloat();
		
		System.out.println("Enter second num: ");
		num2 = in.nextFloat();
		
		//Calculate Total
		sum = num1 + num2;
		
		//Displaying Result
		System.out.println("The sum of " + num1 + " and " +num2 + " is "+ sum);
		
	}

}
