
public class DonationDiscount implements Discount{

	
	@Override
	public double AddDiscount() {
		return 0.72;
	}
	
	@Override
	public void getDescription() {
		System.out.println("Donation Discount");
	}
}

