
public class LandLineDiscount extends Discount{

	public LandLineDiscount(String des) {
		description=des;
	}
	@Override
	public double AddDiscount() {
		return 0.52;
	}
	//@Override
	//public void getDescription() {
		//System.out.println("Land Line Discont  ");
	//}
}

