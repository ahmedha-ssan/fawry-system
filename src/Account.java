import java.util.Scanner;
public class Account {

	public String UserName = " ";
	public String Email = " ";
	public String Password = " ";

	public String UserName1 = "Ahmed";
	public String UserName2 = "Hassan";

	public String Email1 = "Ahmed@gmail.com";
	public String Email2 = "Hassan@gmail.com";

	public String Password1 = "123456";
	public String Password2 = "654321";

	static int count = 0;

	
	public void SignIn(String email, String password) {

		if (email.equals(Email1) && password.equals(Password1)) {
			System.out.println("Successful Sign in !");
		} else if(!email.equals(Email1) && password.equals(Password1)) {
			System.out.println("Error Sign in");
		}
		else if (email.equals(Email2) && password.equals(Password2)) {
			System.out.println("Successful Sign in !");
		} else {
			System.out.println("Error Sign in");
		}
	}
	
	public void SignUp(String name, String email, String password) {
		try (Scanner Obj = new Scanner(System.in)) {
			System.out.println("Your are now in sign in ..");
			System.out.println(("1 - see your inforamtion "));
			System.out.println(("2 - how many users here!!"));
			int methodd = Obj.nextInt(); 

			switch (methodd) {
			case 1:
				this.UserName = name;
				System.out.println("Your Name is : "+name);
				this.Password = password;
				System.out.println("Your Password is : "+password);
				this.Email = email;
				System.out.println("Your Email is : "+email);
			case 2:
				count++;
				
			}
		}
	
	}

	
	public boolean Check(String email, String password) {
		if (email.equals(Email1) && password.equals(Password1)) {
			return true;	
		} else if (email.equals(Email2) && password.equals(Password2)) {
			return true;
		} else if (password == this.Password && email == this.Email) {
			return true;
		} else if (email == null || password == null) {
			return false;
		}else {
			System.out.println("Enter a correct email or Password : ");
			return false;
		}
	}
}
