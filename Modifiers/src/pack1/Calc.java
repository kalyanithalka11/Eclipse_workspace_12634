package pack1;

//Default Scope
 public class Calc {
	//Accessible only within package (pack1)
	public static final double PI_VALUE = 3.14;
	
	//Accessible anywhere within the package(pack1) or outside the package (pack2)
	public static final int MAX_VALUE = 10;
	
	private int length = 5;//private property can be Accessible only within the class
	
	 int findSquare(int num) {
		return num * num;
	}
	 
	 public int findCube(int num) {
		 return num * num * num;
	 }
	 
	 //private methods only accessible only within the class(Calc)
	 private int findTotal(int a, int b) {
		 return a + b;
	 }
	 protected int doubleInt(int num) {
		 return num + num;
	 }
}
