//Functional Interface(contains only one abstract method)
@FunctionalInterface
public interface Printer {
	//public static final String VERSION_NO = "v1.0.0";
	String VERSION_NO = "v1.0.0";
	
	//public abstract voidprintJob();
	void printJob();
	//void scanJob();
	
	default void tShirtPrintJob() {
		System.out.println("tShirt Printing Job");
	}	
	static void threeDPrintJob() { //static method cannot be overridden
		System.out.println("3D Printing Job");
	}
	
	
	default void coffeeCupprintJob() {
		System.out.println("coffee cup Printing Job");
	}
}
