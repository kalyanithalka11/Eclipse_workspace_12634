interface Greet{
	void wish();
}
public class MethodReferenceDemo {
	
	public static void sayHello() {
		System.out.println("Hello...Everybody!");
	}
	public void sayHi() {
		System.out.println("Hii...Everyone");
	}
	public static void main(String[] args) {
		Greet g = () -> MethodReferenceDemo.sayHello();
		g.wish();
		
		//Static method references
		Greet g2 = MethodReferenceDemo :: sayHello;
		g2.wish();
		
		MethodReferenceDemo d = new MethodReferenceDemo();
		Greet g3 = () -> d.sayHi();
		g3.wish();
		
		//Instance method references
		Greet g4 = d :: sayHi;
		g4.wish();
	}
}
