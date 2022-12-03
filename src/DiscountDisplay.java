
public class DiscountDisplay implements User {

	String email;
	String password;
	private Admin dis;
	
	public DiscountDisplay(String email) {
		this.email=email;
		//this.password=password;
	}
	
	@Override
	public void UpDate() {
		String input =(String) dis.GetUpDate(this);
		if(input == null){
			System.out.println(email+":: No Discount added");
		}else
		System.out.println(email+":: your discout is ::"+input);
	}
	
	@Override
	public void Display() {
		System.out.println("Here is the discount...");
	}
	
	@Override
	public void setSubject(Admin A) {
		this.dis=A;
	}
}


