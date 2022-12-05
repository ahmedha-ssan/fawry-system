
public interface Admin {
	public String AdminName =" ";
	public String Password =" ";
	
	Refund refund = new RejectRefund();
	
	
	public void RegisterUser(User u);
	public void RemoveUser(User u);
	public void Notify();
	
	

	
}
