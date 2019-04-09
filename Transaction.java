import java.util.Date;

public class Transaction {

    private static int nextId;
    private int id;
    private int customerId;
    private int creditCardId;
    private int vendorId;
    private double amount;
    private Date date;

    public Transaction(int cId, int ccId, int vId, double amount, Date date) {
        this.id = nextId++;
        this.customerId = cId;
        this.creditCardId = ccId;
        this.vendorId = vId;
        this.amount = amount;
        this.date = date;
    }

    // accessors
    public int getId() {
        return this.id;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public int getCCId() {
        return this.creditCardId;
    }

    public int getVendorId() {
        return this.vendorId;
    }

    public double getAmount() {
        return this.amount;
    }

    public Date getDate() {
        return this.date;
    }

    public void printTransactionInfo() {
        System.out.println("id: " + this.id + " cId: " + this.customerId + " ccId: " + this.creditCardId + " vId: " + this.vendorId 
                            + " amount: " + this.amount + " date: " + this.date.toString());
    }
}