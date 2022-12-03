
public interface Admin {
	public String AdminName =" ";
	public String Password =" ";
	
	//public static final User user = null;
	//public static final Discount dis = new LandLineDiscount();
	//LandLineDiscount.getDescription();
	//public static final Refund refund = new Refund();
	
	//public static final Services services= new Services();
	
	
	public void RegisterUser(User u);
	public void RemoveUser(User u);
	public void Notify();
	
	public Object GetUpDate(User U);
	

	
}
