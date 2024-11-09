
public class MethodDemo {
	//Static Method - used for utility purpose
	public static void findSquare(int num) {
		int square = num * num;
		System.out.println(square);
	}
	//Instance method - Object level (These are specific to the objects)
	public void findCube(int num) {
		int cube = num * num * num;
		System.out.println(cube);
	}
	public static int findMax(int num1, int num2) {
		return (num1 > num2) ? num1 : num2;
		
	}
	public static double findSum(double num1, double num2) {
		return num1 + num2;
	}
	public static double findAvg(double num1, double num2) {
		double total = findSum(num1, num2);
		double avg = total/2;
		return avg;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg = findAvg(44.5, 55.5);
		System.out.println(avg);
		System.out.println(findSum(44.5, 55.5));
		
		
		int max = findMax(250, 600);
		System.out.println(max);
		
		int num = 10;
		findSquare(10);
		
		//Accessing Instance methods
		MethodDemo m = new MethodDemo(); //Object instance Variable/Method
		m.findCube(10);
		
		//Accessing Static methods
		findSquare(10);				//Directly within sample class
		m.findSquare(10);			//refernce variable (not recomended)
		MethodDemo.findSquare(10); //Using Class Name
	}

}
