
public class InterfaceDemo {
	public static void main(String[] args) {
		EpsonPrinter ep = new EpsonPrinter();
		ep.printJob();
		ep.scanJob();
		ep.tShirtPrintJob();
		ep.coffeeCupprintJob();
		
		
		System.out.println("--------------------------------");
		
		CannonPrinter cp = new CannonPrinter();
		cp.printJob();
		cp.scanJob();
		cp.tShirtPrintJob();
		cp.coffeeCupprintJob();
		
		System.out.println("--------------------------------");

		HpPrinter hp = new HpPrinter();
		hp.printJob();
		hp.scanJob();
		hp.coffeeCupprintJob();
		hp.tShirtPrintJob();
		
		System.out.println("--------------------------------");

		Printer p = new EpsonPrinter();
		p.printJob();
		//p.scanJob();
		p.tShirtPrintJob();
		p.coffeeCupprintJob();
		
		System.out.println("--------------------------------");
		
		Printer p1 = new CannonPrinter();
		p1.printJob();
		//p1.scanJob();
		p1.tShirtPrintJob();
		
		Printer.threeDPrintJob();
	}
}
