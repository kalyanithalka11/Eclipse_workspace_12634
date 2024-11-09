import java.util.Scanner;
public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y, z, min, max;
		String s = "false";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter x value: ");
		x = in.nextInt();
		System.out.println("Enter y value: ");
		y = in.nextInt();
		System.out.println("Enter z value: ");
		z = in.nextInt();
		
		//max = (x > y) ? (x > z ? x : z) : (y > z ? y : z);
		//min = (x < y) ? (x < z ? x : z) : (y < z ? y : z);
		
		max = (x > y) && (x > z) ? x : (y > z ? y : z);
		min = (x < y) && (x < z) ? x : (y < z ? y : z);
		 
		
		System.out.println("The max of "+x+","+y+","+z+" is" +max);
		System.out.println("The min of "+x+","+y+","+z+" is" +min);

	}

}
