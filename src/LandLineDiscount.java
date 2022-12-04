
public class LandLineDiscount extends Discount{

	public LandLineDiscount(String des) {
		description=des;
	}
	@Override
	public double AddDiscount() {
		return 0.52;
	}

}

