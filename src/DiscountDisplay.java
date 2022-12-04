
public class DiscountDisplay implements User {

	String email;
	String password;
	
	public DiscountDisplay(String email) {
		this.email=email;
	}
	
	@Override
	public void UpDate() {
		if(email == null){
			System.out.println(email+"Add a correct name");
		}else
		System.out.println(email+" update disocunt ");
	}
	
	@Override
	public void Display() {
		System.out.println("Display the discount...");
	}

}


