public class MobileRechargeDiscount implements Discount{
	
	
	@Override
	public double AddDiscount() {
		return 0.9;
	}
	@Override
	public void getDescription() {
		System.out.println("MobileRecharge Discount ");
	}
	

}
