import java.util.ArrayList;

public class DiscountChange implements Admin{

	private ArrayList<User> Users;
	private String email ;
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
		for (int i = 0; i <2; i++) { 
			U.UpDate();; 
		}
		System.out.println("User Update successfuly...  ");
	}
	
	

	public void setChanges(String email) { 
		System.out.println("Discount add to your bill for user :"+email);
		this.email = email;
		//Notify();
	}


	@Override
	public Object GetUpDate(User U) {
		return this.email;		
	}


	

}




