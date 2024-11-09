public class DiscountCalc {
	
	public  double findDiscount(int totalBillAmount){
			double discount = 0.0;
		
		 	if(totalBillAmount>1000) {
				 discount = totalBillAmount * .30;
			}
			else if(totalBillAmount>750) {
				 discount = totalBillAmount * .25;
			}
			else if(totalBillAmount>500) {
				 discount = totalBillAmount * .2;
			}
			else if(totalBillAmount>250){
		 		discount = totalBillAmount * .15; 
			}	
			else if(totalBillAmount<=250){
		 		discount = totalBillAmount * .1;
		 	}
		 	return discount;		
			
	}
	
}
