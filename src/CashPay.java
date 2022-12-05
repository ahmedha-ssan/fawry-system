import java.util.Scanner;

public class CashPay implements Payment {
	Scanner myObj = new Scanner(System.in);

	String UserName;

	public void getInfo() {
		System.out.println("Enter your name...  ");
		UserName = myObj.nextLine();

	}

	@Override
	public void pay() {
		if (UserName != null)
			System.out.println("correct user info Cash on pay ");
		else
			System.out.println(" Enter a correct cridit card number please...");
	}
}