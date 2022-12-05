import java.util.ArrayList;

public class DiscountChange implements Admin{

	private ArrayList<User> Users;
	public DiscountChange() {
		Users =new ArrayList<User>();
	}
	User U;
	public void RegisterUser(User A) {
		if( A==null) {
			System.out.println("Enter your name correct please..  ");
		}
		Users.add(U);
		System.out.println("User added successfuly...  ");
	}
	
	
	public void RemoveUser(User A) {
		int i =2;
		if (i >= 0) { 
			Users.remove(U); 
		}
		System.out.println("User Removed successfuly...  ");
	}

	public void Notify() {
		if(Users==null) {
			System.out.println("User is not exist...  ");
		}
		else {
			System.out.println("User notify successfuly for the last discount add to the system...  ");
		}
	}
}




