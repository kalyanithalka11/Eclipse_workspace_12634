 
public  class ATMService {
	public static int balance = 5000;
	
	public int balance() {
		return balance;
	}
	public void deposit(int amount) {
		balance = balance + amount;
	}
	public void withdraw(int amount) {
		balance = balance - amount;

	}

}

