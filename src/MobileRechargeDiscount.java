
public class MobileRechargeDiscount extends Discount{
	
	public MobileRechargeDiscount() {
		description="Mobile Recharge Discount";
	}
	@Override
	public double AddDiscount() {
		return 0.9;
	}


}
