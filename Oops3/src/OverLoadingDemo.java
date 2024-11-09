class MyCalc{
	public static int findMax(int a, int b) {
		return (a > b)? a:b;
	}
	public static long findMax(long a, long b) {
		return (a > b)? a:b;
	}
	public static float findMax(float a, float b) {
		return (a > b)? a:b;
	}
	public static double findMax(double a, double b) {
		return (a > b)? a:b;
	}
	
	//Variable length method or Var Arg method
	public static void sum(int... a) {
		System.out.println("Java");
	}
	
	public static void sum1(int... a) {
		int total = 0;
		for(int x : a) {
			total += x;
		}
		System.out.println();
	}
}
public class OverLoadingDemo {
	public static void main(String[] args) {
		int maxInt = MyCalc.findMax(100, 200);
		System.out.println(maxInt);
		
		long maxLong = MyCalc.findMax(12456398, 45631266);
		System.out.println(maxLong);
		
		/*float maxFloat = MyCalc.findMax(12.2, 14.6);
		System.out.println(maxFloat);*/
		
		double maxDouble = MyCalc.findMax(123.124, 123.548);
		System.out.println(maxDouble);
		
		MyCalc.sum(10);
		MyCalc.sum(10,5,6,4);
		
		MyCalc.sum1(new int[] {1, 2, 3});
		
		
		
	}
	
}
