
public class Specific extends Decorator {
	
	Discount discount;
	public Specific(Discount discount) {
		super(discount);
	}

	public void getDescription() {
		discount.getDescription();
		System.out.println(  ", Specific");
	}

	public double AddDiscount() {
		return discount.AddDiscount()-0.70;
	}
	
}


