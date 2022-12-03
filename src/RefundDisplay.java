
public class RefundDisplay implements User{

	String email;
	String password;
	private Admin dis;
	
	public RefundDisplay(String email) {
		this.email=email;
		//this.password=password;
	}
	
	

	@Override
	public void UpDate() {
		String input =(String) dis.GetUpDate(this);
		if(input == null){
			System.out.println(email+":: No Refunds added");
		}else
		System.out.println(email+":: your Refund is ::"+input);
	}
	
	@Override
	public void Display() {
		System.out.println("Here is the Refund...");
	}
	
	@Override
	public void setSubject(Admin A) {
		this.dis=A;
	}
}



