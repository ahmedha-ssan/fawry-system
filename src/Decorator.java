
public abstract class Decorator implements Discount{
	protected Discount discount;
	public Decorator(Discount discount) {
		this.discount=discount;
	}
	
	public void getDescription() {
		this.discount.getDescription();
	}
	
	public double AddDiscount() {
		this.discount.AddDiscount();
		return 0;
	}
}
//abstract String getDescription()