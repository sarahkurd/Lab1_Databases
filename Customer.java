public class Customer {

    // fields
    private static int nextId;

    private int ssn;
    private int id;
    private String name;
    private String address;
    private long phone;

    // constructor
    public Customer(int ssn, String name, String address, long phone) {
        this.id = nextId++;
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    // accessors
    public int getSSN() {
        return this.ssn;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public long getPhone() {
        return this.phone;
    }

    public void printCustomer() {
        System.out.println("id: " + this.id + " name:" + this.name + " ssn: " + this.ssn
                            + " address: " + this.address + " phone: " + this.phone);
    }

}