
public class RejectRefund extends Refund {

	@Override
	public void state() {
		System.out.println("Refund Rejected ");
	}

}
