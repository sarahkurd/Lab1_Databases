public class Vendor {

    //fields
    private static int nextId;
    private int id;
    private String name;
    private String address;

    public Vendor(String name, String address) {
        this.id = nextId++;
        this.name = name;
        this.address = address;
    }

    // accessors
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void printVendorInfo() {
        System.out.println("id: " + this.id + " name: " + this.name + " address: " + this.address);
    }
}