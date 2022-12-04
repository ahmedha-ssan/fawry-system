
public class RefundDisplay implements User {

	String email;
	String password;
	public RefundDisplay(String email) {
		this.email = email;
		// this.password=password;
	}

	@Override
	public void UpDate() {
		if (email == null) {
			System.out.println(email + " No Refunds added");
		} else
			System.out.println(email + " update refund ");
	}

	@Override
	public void Display() {
		System.out.println("Display the Refund...");
	}

}
