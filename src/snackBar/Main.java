package snackBar;

public class Main{
    private static void snackTime()
    {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob ", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel ", 30, 2.00, v1.getId());
        Snack s4 = new Snack("Soda ", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water ", 20, 2.75, v2.getId());

        // print outs
        System.out.println("*** Processing Snacking Data ***");

        // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
        System.out.println("Customer " + c1.getName() + " starting cash is: " + c1.getCash() + "\n" + "Soda quantity: " + s4.getQuantity() + "\n");
        c1.buySnack(s4, 3);
        System.out.println("Customer " + c1.getName() + " cash remaining is: " + c1.getCash() + "\n" + "Soda quantity: " + s4.getQuantity() + "\n");

        // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
        System.out.println("Customer " + c1.getName() + " starting cash is: " + c1.getCash() + "\n" + s3.getName() + " quantity: " + s3.getQuantity() + "\n");
        c1.buySnack(s3, 1);
        System.out.println("Customer " + c1.getName() + " cash remaining is: " + c1.getCash() + "\n" + s3.getName() + " quantity: " + s3.getQuantity() + "\n");
        
        // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
        System.out.println("Customer " + c2.getName() + " starting cash is: " + c2.getCash() + "\n" + s4.getName() + " quantity: " + s4.getQuantity() + "\n");
        c2.buySnack(s4, 2);
        System.out.println("Customer " + c2.getName() + " cash remaining is: " + c2.getCash() + "\n" + s4.getName() + " quantity: " + s4.getQuantity() + "\n");

        //Customer 1 finds $10. Print Customer 1 Cash on Hand.
        System.out.println("Customer " + c1.getName() + " starting cash is: " + c1.getCash() + "\n" );
        c1.addCash(10);
        System.out.println("Customer " + c1.getName() + " cash remaining is: " + c1.getCash() + "\n");

        // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
        System.out.println("Customer " + c1.getName() + " starting cash is: " + c1.getCash() + "\n" + s2.getName() + " quantity: " + s2.getQuantity() + "\n");
        c1.buySnack(s2, 1);
        System.out.println("Customer " + c1.getName() + " cash remaining is: " + c1.getCash() + "\n" + s2.getName() + " quantity: " + s2.getQuantity() + "\n");

        // Snack 3 gets 12 more. Print quantity of snack 3.
        System.out.println(s3.getName() + " quantity: " + s3.getQuantity() + "\n");
        s3.addQuantity(12);
        System.out.println(s3.getName() +  " quantity: " + s3.getQuantity() + "\n");

        // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
        System.out.println("Customer " + c2.getName() + " starting cash is: " + c2.getCash() + "\n" + s3.getName() + " quantity: " + s3.getQuantity() + "\n");
        c2.buySnack(s3, 3);
        System.out.println("Customer " + c2.getName() + " cash remaining is: " + c2.getCash() + "\n" + s3.getName() + " quantity: " + s3.getQuantity() + "\n");
    }
 

    public static void main(String[] args)
    {
        snackTime();
    }
}