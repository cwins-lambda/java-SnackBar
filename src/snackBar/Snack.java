// Snack has id, name, quantity, cost, vending machine id
// Snack can set name, get quantity, add quantity given quantity, buy snack given quantity, get total cost given a quantity.

package snackBar;

public class Snack{
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingId;

    public Snack (String name, int quantity, double cost, int vendingId)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingId = vendingId;
    }

    // getters and setters
    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int quant)
    {
        this.quantity += quant;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void buySnack(int quantity)
    {
        if (quantity > 0) {
            if (this.quantity >= quantity) {
                this.quantity -= quantity;
            }
        }
    }

    public double getTotCost(int quantity)
    {
        return this.cost * quantity;
    }


}