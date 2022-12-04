
public interface Admin {
	public String AdminName =" ";
	public String Password =" ";

	
	public void RegisterUser(User u);
	public void RemoveUser(User u);
	public void Notify();
	
	public Object GetUpDate(User U);
	

	
}
