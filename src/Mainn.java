public class Mainn {

	public static void main(String[] args) {
		//ArrayList<User> users = new ArrayList<User>();
        System.out.println("Main to test observer pattern on user and admin...");

		//create and test Observer discount change with the user and admin interface...
		DiscountChange dis = new DiscountChange();
		//observers
		User obj1 = new DiscountDisplay("Obj1");
		User obj2 = new RefundDisplay("Obj2");
		//register observers
		dis.RegisterUser(obj1);
		dis.RegisterUser(obj2);
		//observers intract with the subject
		obj1.setSubject(dis);
		obj2.setSubject(dis);
		//check if any update is available
		obj1.UpDate();
		dis.GetUpDate(obj2);
		obj2.UpDate();
        System.out.println("/////////////////////////////////////////////////////////////////");
        
	
		
	}

}
