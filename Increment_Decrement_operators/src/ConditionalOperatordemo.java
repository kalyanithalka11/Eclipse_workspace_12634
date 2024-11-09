import java.util.Scanner;
public class ConditionalOperatordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, max, min;
		
		Scanner in = new Scanner(System.in);
		//x = 100;
		//y = 200;
		System.out.println("Enter the X value: ");
		x = in.nextInt();
		System.out.println("Enter the y value: ");
		y = in.nextInt();
		
		 
		max = (x > y) ? x : y;
		min = (x < y) ? x : y;
		
		System.out.println("Max of "+x+" and "+y+" is "+max);
		System.out.println("Min of "+x+" and "+y+" is "+min);
		
		
		
		
		
		
	}

}
