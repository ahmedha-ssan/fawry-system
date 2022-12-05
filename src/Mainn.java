public class Mainn {

	public static void main(String[] args) {
		System.out.println("/////////////////////////////////////////////////////////////////");
		System.out.println();

		System.out.println("Test discount change (observer pattern)...");
		// create and test Observer discount change with the user and admin interface...
		DiscountChange dis = new DiscountChange();
		// observers
		System.out.println();

		User obj1 = new DiscountDisplay("Obj1");
		User obj2 = new RefundDisplay("Obj2");
		// register observers
		dis.RegisterUser(obj1);
		dis.RemoveUser(obj1);
		dis.RegisterUser(obj2);
		//display from user
		obj1.Display();
		System.out.println();
		
		dis.Notify();

		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////");
	
	}

}
