// enum type
enum Type 
{ 
    Visa, MasterCard, AmericanExpress, Discover; 
}

public class CreditCard {

    //fields
    private static int nextId;
    private int id;
    private Type type;
    private int creditLimit;
    private double currentBalance;
    private Boolean active;

    //constructor
    public CreditCard(Type type, int creditLimit, double currentBalance) {
        this.id = nextId++;
        this.type = type;
        this.creditLimit = creditLimit;
        this.currentBalance = currentBalance;
        this.active = false;
    }

    //getters
    public int getId() {
        return this.id;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public Type getType() {
        return this.type;
    }

    public double getCurrentBalance() {
        return this.currentBalance;
    }

    public Boolean getActive() {
        return this.active;
    }

    //methods
    public void activate() {
        this.active = true;
    }

    public void updateBalance(double amount) {
        this.currentBalance += amount;
    }

    public void printCardInfo() {
        System.out.println("Card Id: " + this.id + " Balance: " + this.currentBalance + " Credit Limit: " + this.creditLimit + " Active?: " + this.active);
    }
}