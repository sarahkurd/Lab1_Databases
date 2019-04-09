import java.util.Date;

public class Payment {
    
    // fields
    private static int nextId;
    private int id;
    private Date date;
    private int creditCardId;
    private double amount;

    public Payment(int ccId, double amount, Date date) {
        this.id = nextId++;
        this.date = date;
        this.creditCardId = ccId;
        this.amount = amount;
    }

    // accessors
    public int getId() {
         return this.id;
    }

    public int getCreditCardId() {
        return this.creditCardId;
    }

    public Date getDate() {
        return this.date;
    }

    public double getAmount() {
        return this.amount;
    }

    public void printPaymentInfo() {
        System.out.println("id: " + this.id + " date: " + this.date.toString() 
                            + " ccId: " + this.creditCardId + " amount: " + this.amount);
    }


}