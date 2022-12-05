import java.util.Scanner;

public class Services implements ServicesProvider {
	String ServicesName = " ";
	static int count = 0;
	// public static final ServicesProvider provide = null;
	// public static final Payment payment = null;
	// objs for Services
	MobileRecharge ob1;
	InternetPayment ob2;
	LandLine ob3;
	Donation ob4;

	double payment;
	// obs for payment methods
	CreditCard obj1;
	OnlineWallet obj2;
	CashPay obj3;

	protected Services AddServices(String name) {
		return null;
	}

	public Services getServices(String name) {
		count++;
		if (name == null) {
			return null;
		}
		if (name.equalsIgnoreCase("MobileRecharge")) {
			return new MobileRecharge();
		} else if (name.equalsIgnoreCase("InternetPayment")) {
			return new InternetPayment();
		} else if (name.equalsIgnoreCase("LandLine")) {
			return new LandLine();
		} else if (name.equalsIgnoreCase("Donation")) {
			return new Donation();
		}
		return null;
	}

	public Services setServices(String name) {
		Services services = AddServices(name);
		services.addPayment();
		return services;
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

	public void infoo() {
		MobileRecharge ob1 = new MobileRecharge();
		InternetPayment ob2 = new InternetPayment();
		LandLine ob3 = new LandLine();
		Donation ob4 = new Donation();
		
		CreditCard obj11 = new CreditCard();
		OnlineWallet obj22 = new OnlineWallet();
		CashPay obj33 = new CashPay();

		try (Scanner myObj = new Scanner(System.in)) {
			
			// void choosePayMethod(){
			System.out.println("Choose a payment method..(from 1 to 3 only)");
			System.out.println("1 - pay bye Cridit card");
			System.out.println("2 - pay bye onlie wallet");
			System.out.println("3 - pay on cash");
			int method = myObj.nextInt(); // Read user input

			switch (method) {
			case 1:
				obj11.getInfo();
				obj11.pay();
				break;
			case 2:
				obj22.getInfo();
				obj22.pay();
				break;
			case 3:
				obj33.getInfo();
				obj33.pay();
				break;
			}

			System.out.println("Choose a payment services..(from 1 to 4 only)");
			System.out.println("1 - pay for Mobile Recharge");
			System.out.println("2 - pay for Internet Payment");
			System.out.println("3 - pay for LandLine");
			System.out.println("4 - pay for Donation");
			int services = myObj.nextInt(); // Read user input
			switch (services) {
			case 1:
				System.out.println("Choose a Mobile Recharge payment Provider..(from 1 to 4 only)");
				System.out.println("1 - pay for Mobile Recharge Vodafone");
				System.out.println("2 -  pay for Mobile Recharge Etisalat");
				System.out.println("3 -  pay for Mobile Recharge Orange");
				System.out.println("4 -  pay for Mobile Recharge We");
				int servicesProviders = myObj.nextInt(); // Read user input
				switch (servicesProviders) {
				case 1:
					ob1.Display();
					ServicesProvider provider = new MobileRechargeVoda();
					System.out.println(provider.paybell());
					break;
				case 2:
					ob1.Display();
					ServicesProvider provider2 = new MobileRechargeEtisalat();
					System.out.println(provider2.paybell());
					break;
				case 3:
					ob1.Display();
					ServicesProvider provider3 = new MobileRechargeOrange();
					System.out.println(provider3.paybell());
					break;
				case 4:
					ob1.Display();
					ServicesProvider provider4 = new MobileRechargeWe();
					System.out.println(provider4.paybell());
					break;
				}
				break;

			case 2:
				System.out.println("Choose a Internet Payment Provider..(from 1 to 4 only)");
				System.out.println("1 - pay for Internet Payment Vodafone");
				System.out.println("2 -  pay for Internet Payment Etisalat");
				System.out.println("3 -  pay for Internet Payment Orange");
				System.out.println("4 -  pay for Internet Payment We");
				int servicesProviders2 = myObj.nextInt(); // Read user input
				// int choosse3=5;
				switch (servicesProviders2) {
				case 1:
					ob2.Display();
					ServicesProvider provider = new InternetPaymentVoda();
					System.out.println(provider.paybell());
					break;
				case 2:
					ob2.Display();
					ServicesProvider provider2 = new InternetPaymentEtisalat();
					System.out.println(provider2.paybell());
					break;
				case 3:
					ob2.Display();
					ServicesProvider provider3 = new InternetPaymentOrange();
					System.out.println(provider3.paybell());
					break;
				case 4:
					ob2.Display();
					ServicesProvider provider4 = new InternetPaymentWe();
					System.out.println(provider4.paybell());
					break;
				}
				break;

			case 3:
				System.out.println("Choose a Land Line Provider..(from 1 to 2 only)");
				System.out.println("1 - pay for Land Line Monthly Receipt ");
				System.out.println("2 - pay for Land Line Quarter Receipt");
				int servicesProviders3 = myObj.nextInt();
				switch (servicesProviders3) {
				case 1:
					ob3.Display();
					ServicesProvider provider = new LandLineMonthlyReceipt();
					System.out.println(provider.paybell());
					break;
				case 2:
					ob3.Display();
					ServicesProvider provider2 = new LandLineQuarterReceipt();
					System.out.println(provider2.paybell());
					break;
				}
				break;

			case 4:
				System.out.println("Choose a Internet Payment Provider..(from 1 to 3 only)");
				System.out.println("1 - pay for Donation Cancer Hospital");
				System.out.println("2 -  pay for Donation NGOs");
				System.out.println("3 -  pay for Donation Schools");
				int servicesProviders4 = myObj.nextInt();
				switch (servicesProviders4) {
				case 1:
					ob4.Display();
					ServicesProvider provider = new DonationCancerHospital();
					System.out.println(provider.paybell());
					break;
				case 2:
					ob4.Display();
					ServicesProvider provider2 = new DonationNGOs();
					System.out.println(provider2.paybell());
					break;
				case 3:
					ob4.Display();
					ServicesProvider provider3 = new DonationSchools();
					System.out.println(provider3.paybell());
					break;

				}
				break;
			}
		}
	}
}
