class parent{
	public final void study() { //when we declare "final" keyword the method should not be overridden by the child class
		System.out.println("Medicine");
	}
	public void property() {
		System.out.println("100Acre land + 100kg Gold + 100cr cash");
	}
	public void marry() {
		System.out.println("Arranged Marriage");
	}
}
class child extends parent {
	@Override
	public void marry() {
		
		System.out.println("Love Marriagr"); 
		super.marry();//calling parent class
	}
	
}

public class OverRidingDemo {
	public static void main(String[] args) {
		parent p = new parent();
		p.study();
		p.property();
		p.marry();
		
		
		System.out.println("---------------------------------------------------------");
		
		child c = new child();
		c.study();
		c.property();
		c.marry();
		
	}
}
