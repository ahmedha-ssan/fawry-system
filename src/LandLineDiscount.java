
public class LandLineDiscount implements Discount{

	
	@Override
	public double AddDiscount() {
		return 0.57;
	}
	@Override
	public void getDescription() {
		// TODO Auto-generated method stub
		System.out.println("Land Line Discont  ");
	}
}
