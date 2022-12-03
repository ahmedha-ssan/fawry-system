
public class Specific extends Decorator {
	
	Discount discount;
	public Specific(Discount dis) {
		discount=dis;
	}

	public String getDescription() {
		return discount.getDescription()+"  Specific ";
	}

	public double AddDiscount() {
		//double x=discount.AddDiscount();
		return 0.70+discount.AddDiscount();
	}
	
}



