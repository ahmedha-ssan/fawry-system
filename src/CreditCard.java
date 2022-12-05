import java.util.Scanner;

public class CreditCard implements Payment{
	Scanner myObj = new Scanner(System.in); 
	String criditcard;	
	String UserName;
	
	public void getInfo() {
		System.out.println("Enter your name...  ");
	    UserName = myObj.nextLine();
	   
		System.out.println("Enter your credit card number... ");
	    criditcard = myObj.nextLine();
	}

	@Override
	public void pay() {
		if(criditcard != null && UserName!=null)
			System.out.println("correct info for pay with credit card");
		else
			System.out.println(" Enter a correct cridit card number please...");
	}
}
