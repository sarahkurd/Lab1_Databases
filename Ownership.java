public class Ownership {

    private static int nextId;
    private int id;
    private int customerId;
    private int creditCardId;
    private Boolean current;

    public Ownership(int cId, int ccId) {
        this.id = nextId++;
        this.customerId = cId;
        this.creditCardId = ccId;
        this.current = true;
    }

    // accessors
    public int getId() {
        return this.id;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public int getCreditCardId() {
        return this.creditCardId;
    }

    public Boolean getCurrent() {
        return this.current;
    }

    // methods
    public void cancelCard(int ccId) {
        this.current = false;
    }

    public void printOwnership() {
        System.out.println("customerId: " + this.customerId + " creditCardId: " + this.creditCardId + " current?: " + this.current);
    }
}