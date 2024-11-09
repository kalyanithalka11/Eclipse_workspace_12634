import java.util.Scanner;

public class ATMApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMService service = new ATMService();

		Scanner in = new Scanner(System.in);
		int option = 0;
		do{
			System.out.println("ABC ATM app");
			System.out.println("--------------------");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Exit");
			System.out.println("Please choose option: ");
			option = in.nextInt();
  			
		switch(option) {
		case 1:
			System.out.println("Enter Deposit amount");
			int depositAmount = in.nextInt();
			service.deposit(depositAmount);
			System.out.println("Deposit is successful!");
			break;
		case 2:
			System.out.println("Enter withdraw amount: ");
			int withdrawAmount = in.nextInt();
			
			if(withdrawAmount > service.balance) {
				System.out.println("Insufficient Balance!");
			}else if(withdrawAmount < 100) {
				System.out.println("Minimum withdraw amount is 100.");
			}else {
				System.out.println("Withdraw  proccessing");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			service.withdraw(withdrawAmount);
			System.out.println("Withdrawl is successful!");
			break;
		case 3:
			int balance = service.balance();
			System.out.println("Balance: "+balance);
		case 0:
			System.out.println("Bye Byee!!");
			break;
		default:
			System.out.println("Invalid Option.  ");
		}
	
	}while(option != 0);
}
}
