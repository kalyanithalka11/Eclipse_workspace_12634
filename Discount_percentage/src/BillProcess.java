
public class BillProcess {
	
	public void displayFinalBill(int totalBillAmount) {
		DiscountCalc calc = new DiscountCalc();
		double discount = calc.findDiscount(totalBillAmount);
		
		System.out.println("The total bill: "+totalBillAmount);
		System.out.println("Discount: "+discount);
		System.out.println("Final Amount to pay: "+(totalBillAmount - discount));
	}

}
