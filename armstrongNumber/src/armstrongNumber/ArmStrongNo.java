package armstrongNumber;


public class ArmStrongNo {
	public static void main(String[] args) {
		int n = 153;
		int num = n;
		int r, sum = 0;
		
		while(n>0) {
			r = n%10;
			n = n/10;
			sum = sum + r*r*r;
			
		}
		if(num == sum) {
			System.out.println("It's an Armstrong number.");
		}
		else {
			System.out.println("Not an Armstrong number.");
		}
	
	}
}
