//Customer has id, name, cash on hand
//Customer can add cash, buy given total cash used in purchase, get and set name, get cash on hand.

package snackBar;

public class Customer{
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer (String name, double cash)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cash = cash;
    }

    // getters / setters

    public String getName()
    {
        return this.name;
    }

    public double getCash()
    {
        return this.cash;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addCash(double cash)
    {
        this.cash += cash;
    }

    public void buySnack(Snack snack, int quantity)
    {
        snack.buySnack(quantity);
        this.cash -= snack.getTotCost(quantity);
    }
}