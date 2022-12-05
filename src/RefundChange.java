import java.util.ArrayList;

public class RefundChange implements Admin{

	private ArrayList<User> Users;
	User U;
	
	public RefundChange() {
		Users =new ArrayList<User>();
	}
	
	public void RegisterUser(User A) {;
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
		System.out.println("Refund Removed successfuly...  ");
		
	}



	public void Notify() {
		if(Users==null) {
			System.out.println("User is not exist...  ");
		}
		else {
			System.out.println("User notify successfuly for the last Refund add ...  ");

		}
	}


	
}
