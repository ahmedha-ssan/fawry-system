public class Mainn {

	public static void main(String[] args) {
		System.out.println("Welcome on our software system");
		System.out.println();
		// object from account
		Account a = new Account();

		System.out.println("User sign in and admin check if his info is exist or not...");
		System.out.println();
		
		a.SignIn("Ahmed@gmail.com", "123456");
		System.out.println("Is exist or not : " + a.Check("Ahmed@gmail.com", "123456"));
		System.out.println();

		a.SignIn("Ahmed@gmail.com", "3333");
		System.out.println("Is exist or not : " + a.Check("Ahmed@gmail.com", "3333"));
		System.out.println();

		a.SignUp("saad", "Saad@gmail.com", "111");

		System.out.println();
		System.out.println("/////////////////////////////////////////////////////////////////");
		System.out.println();

		// obj from services class to access its sub class and methods
		// Services service = new Services();
		// service.getServices("MobileRecharge");
		System.out.println("Admin accept or reject the refund request...");
		System.out.println();
		Refund refund1 = new AcceptRefund();
		Refund refund2 = new RejectRefund();

		refund1.state();
		refund2.state();
		System.out.println();

		System.out.println("Admin list the refund requests...");
		System.out.println();

		System.out.println(refund1.listReq("MobileRecharge", "50"));
		System.out.println(refund1.listReq("Donation", "500"));

		System.out.println();
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
		
		System.out.println();

		System.out.println("Test Discount with discount decorator (Decorator pattern)...");
		// decorator to add cost of each discount..
		// test 1
		Discount discount = new LandLineDiscount("Land Line Discount");
		System.out.println(discount.getDescription() + " $ " + discount.AddDiscount());
		// test 2
		Discount discount2 = new LandLineDiscount("Land Line Discount with overall discount ");
		discount2 = new Specific(discount2);
		System.out.println(discount2.getDescription() + " $ " + discount2.AddDiscount());
		// test 2
		Discount discount3 = new LandLineDiscount("Land Line Discount with overall discount and specific ");
		discount3 = new Overall(discount3);
		discount3 = new Specific(discount3);
		System.out.println(discount3.getDescription() + " $ " + discount3.AddDiscount());
		System.out.println();

		System.out.println("/////////////////////////////////////////////////////////////////");
		System.out.println();
		Services service1 = new Services();
		service1.infoo();
		// objects for providers

		System.out.println();

		System.out.println("Hope to see you again thanks for use of our system");
	}
	

}
