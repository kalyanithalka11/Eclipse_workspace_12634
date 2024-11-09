package pack1;

public class CalcTest extends Calc {
	public static void main(String[] args) {
		Calc c = new Calc();
	
	    int result = c.findSquare(10);{
	    System.out.println(result);
			
		System.out.println(c.findCube(10));
		
		System.out.println(c.doubleInt(10));
		}
	}
}
