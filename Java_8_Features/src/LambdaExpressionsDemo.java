import java.lang.FunctionalInterface;
@FunctionalInterface
interface MyFunctionalInterface{ //Lambda expressions are anonimous functions, the return type is functional interface
	void wish();
}

class Hello implements MyFunctionalInterface{
	@Override
	public void wish() {
		System.out.println("Hello...Everybody!");
	}
}
@FunctionalInterface
interface MyFunctionalInterface2{
	int findSquare(int num);
}
@FunctionalInterface
interface MyFunctionalInterface3{
	int findTotal(int num1, int num2);
}
@FunctionalInterface
interface MyFunctionalInterface4{
	boolean isEven(int num);
}
public class LambdaExpressionsDemo {
	public static void main(String[] args) {
		MyFunctionalInterface myfun = new Hello();
		myfun.wish();
		
		MyFunctionalInterface myfun1 = () -> System.out.println(("hai..."));
		myfun1.wish();
		
		MyFunctionalInterface2 myfun2 = (int num) -> num * num;
		int square = myfun2.findSquare(10);
		System.out.println(square);
		
		MyFunctionalInterface3 myfun3 = (x, y) -> x+y;
		System.out.println(myfun3.findTotal(10, 20));
		
		MyFunctionalInterface4 myfun4 = (num) -> num%2 ==0;
		System.out.println(myfun4.isEven(15));
		
	}
}
