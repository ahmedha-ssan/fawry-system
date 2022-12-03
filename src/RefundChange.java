import java.util.ArrayList;

public class RefundChange implements Admin{

	private ArrayList<User> Users;
	private String email ;
	
	User U;
	
	public RefundChange() {
		Users =new ArrayList<User>();
	}
	
	public void RegisterUser(User A) {;
		if( A==null) {
			System.out.println("Enter your name correct please..  ");
		}
		Users.add(U);
		System.out.println("Refund added successfuly...  ");
	}


	
	public void RemoveUser(User A) {
		int i =2;
		if (i >= 0) { 
			Users.remove(U); 
		} 
		System.out.println("Refund Removed successfuly...  ");
		
	}



	public void Notify() {
		for (int i = 0; i <2; i++) { 
			U.UpDate(); 
		}
		System.out.println("Refund Update successfuly...  ");
	}



	public void setChanges(String email) { 
		System.out.println("Refound add to your bill for user :"+email);
		this.email = email;
		Notify();
	}


	@Override
	public Object GetUpDate(User U) {
		return this.email;		
	}
}


	
	
	




