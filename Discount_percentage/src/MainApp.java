import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the total bill amount: ");
		int totalBillAmount = in.nextInt();
		
		BillProcess bill = new BillProcess();
		bill.displayFinalBill(totalBillAmount);
	}

}
