
public class InternetDiscount implements Discount{
	
	
	@Override
	public double AddDiscount() {
		return 0.22;
	}
	@Override
	public void getDescription() {
		// TODO Auto-generated method stub
		System.out.println("Internet Discount ");
	}
}




