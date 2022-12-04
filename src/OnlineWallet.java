import java.util.Scanner;

public class OnlineWallet implements Payment {
	Scanner myObj = new Scanner(System.in);
	String email;
	String UserName;
	String Password;

	public void getInfo() {
		System.out.println("Enter your name...  ");
		UserName = myObj.nextLine();

		System.out.println("Enter your email name... ");
		email = myObj.nextLine();

		System.out.println("Enter your password ... ");
		Password = myObj.nextLine();

	}

	@Override
	public void pay() {
		if (email != null && UserName != null && Password != null)
			System.out.println("correct info for pay with online wallet");
		else
			System.out.println(" Enter a inputs for your wallet please...");
	}
}