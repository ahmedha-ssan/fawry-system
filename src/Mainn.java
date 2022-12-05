public class Mainn {

	public static void main(String[] args) {
		//ArrayList<User> users = new ArrayList<User>();
        System.out.println("Test (observer pattern)...");
		//create and test Observer discount change with the user and admin interface...
		DiscountChange dis = new DiscountChange();
		//observers
		User obj1 = new DiscountDisplay("Obj1");
		User obj2 = new RefundDisplay("Obj2");
		//register observers
		
		//observers intract with the subject
		dis.RegisterUser(obj1);
		dis.RemoveUser(obj1);
		dis.RegisterUser(obj2);
		//display from user
		obj1.Display();
		//check if any update is available
		obj1.UpDate();
		obj2.UpDate();
        System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println("Test Discount (Decorator pattern)...");
        //decorator to add cost of each discount..
        //test 1 
        Discount discount=new LandLineDiscount("Land Line Discount");
        System.out.println(discount.getDescription()+" $ "+discount.AddDiscount());
        //test 2
        Discount discount2=new LandLineDiscount("Land Line Discount with overall discount ");        
        discount2=new Specific(discount2);
        System.out.println(discount2.getDescription()+" $ "+discount2.AddDiscount());
        // test 2
        Discount discount3=new LandLineDiscount("Land Line Discount with overall discount and specific ");        
        discount3=new Overall(discount3);
        discount3=new Specific(discount3);
        System.out.println(discount3.getDescription()+" $ "+discount3.AddDiscount());
        
        System.out.println("/////////////////////////////////////////////////////////////////");

	}

}
