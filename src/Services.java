public class Services implements ServicesProvider {
	String ServicesName=" ";
	static int count=0;
	//public static final ServicesProvider provide = null;
	//public static final Payment payment = null;
	//objs for Services
	MobileRecharge ob1;
	InternetPayment ob2;
	LandLine ob3;
	Donation ob4;
	
	double payment;
	//obs for payment methods
	//CreditCard obj1;
	//OnlineWallet obj2;
	//CashPay obj3;
	
	
	protected Services AddServices(String name) {
		return null;
	}
	
	
	void setPayment(double d) {
		this.payment = d;
	}

	double addPayment() {
		return payment;
	}
	
	public boolean search(String name) {
		count++;
		if (ob1.ServicesName == "MobileRecharge")
			return true;
		if (ob2.ServicesName == "InternetPayment")
			return true;
		if (ob3.ServicesName == "LandLine")
			return true;
		if (ob4.ServicesName == "Donation")
			return true;
		else
			return false;
	}

	public void AddProvider() {
		System.out.println(" Admin can add provider ");
	}

	@Override
	public double paybell() {
		// TODO Auto-generated method stub
		return 0;
	}

}
	
	