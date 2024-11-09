package pack2;

import pack1.Calc;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		//System.out.println(c.findSquare(10));
		
		System.out.println(Calc.PI_VALUE);
		
		System.out.println(c.findCube(10));
		System.out.println(Calc.MAX_VALUE);
	}
	
	
}
