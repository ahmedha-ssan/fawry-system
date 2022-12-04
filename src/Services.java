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
	CreditCard obj1;
	OnlineWallet obj2;
	CashPay obj3;
	
	
	protected Services AddServices(String name) {
		return null;
	}