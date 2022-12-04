
public class DonationDiscount extends Discount{

	public DonationDiscount() {
		description="Donation Discount";
	}
	@Override
	public double AddDiscount() {
		return 0.72;
	}
	

}

