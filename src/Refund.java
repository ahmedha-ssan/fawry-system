
public abstract class Refund {
	Services obj = new Services();

	public String ServiceName1 = "MobileRecharge";
	public String Ammount1 = "50";

	public String ServiceName2 = "InternetPayment";
	public String Ammount2 = "66.5";

	public String ServiceName3 = "LandLine";
	public String Ammount3 = "200.30";

	public String ServiceName4 = "Donation";
	public String Ammount4 = "500";

	int count = 0;

	public String listReq(String ServiceName, String Ammount) {
		if (ServiceName.equals(ServiceName1) && Ammount.equals(Ammount1)) {
			count++;
			System.out.println(ServiceName1+" : add to our list .. its cost "+Ammount+ " list in # " + count);
		} else if (ServiceName.equals(ServiceName2) && Ammount.equals(Ammount2)) {
			count++;
			System.out.println(ServiceName2+" : add to our list .. its cost "+Ammount+ " list in # " + count);
		} else if (ServiceName == this.ServiceName3 && Ammount == this.Ammount3) {
			count++;
			System.out.println(ServiceName3+" : add to our list .. its cost "+Ammount+ " list in # " + count);
		} else if (ServiceName == this.ServiceName4 && Ammount == this.Ammount4) {
			count++;
			System.out.println(ServiceName4+" : add to our list .. its cost "+Ammount+ " list in # " + count);
		} else {
			System.out.println("Enter a correct Service name : ");
		}
		return "";

	}

	public abstract void state();

}
