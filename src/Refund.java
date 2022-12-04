
public abstract class Refund {
	Services obj =new Services();
	public void listReq(String ServiceName, double Ammount) {
			obj.AddServices(ServiceName);
			obj.setPayment(Ammount);
			obj.addPayment();
	}
	// related service and the amount to be refunded
	public abstract void state();
	public void listReq(Services services, double ammount) {
		// TODO Auto-generated method stub
		
	}

}
