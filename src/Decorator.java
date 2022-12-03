
public abstract class Decorator extends Discount{
	protected Discount discount;
	
	
	public abstract double AddDiscount();
	
	public abstract String getDescription();
	
}