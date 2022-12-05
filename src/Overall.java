public class Overall extends Decorator {

	Discount discount;
	
	public Overall(Discount dis) {
		discount=dis;
		//super(discount);
	}
	
	public String getDescription() {
		return discount.getDescription()+"  Overall discount";
	}

	public double AddDiscount() {
		//double x=
		//System.out.println( +0.20);

		return 0.20+discount.AddDiscount();
	}
	
}



