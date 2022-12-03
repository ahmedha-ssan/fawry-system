public class Overall extends Decorator {

	Discount discount;
	
	public Overall(Discount discount) {
		super(discount);
	}
	
	public void getDescription() {
		discount.getDescription();
		System.out.println(  ", Overall");
	}

	public double AddDiscount() {
		return discount.AddDiscount()-0.20;
	}

}
