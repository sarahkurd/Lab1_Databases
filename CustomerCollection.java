import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class CustomerCollection {

    // data structure to store collection of customers
    HashMap customersId = new HashMap<Integer, Customer>();
    HashMap customersSsn = new HashMap<Integer, Customer>();

    public void addCustomer(Customer c) {
        customersId.put(c.getId(), c);
        customersSsn.put(c.getSSN(), c);
    }

    public Boolean checkSsn(int cSsn) {
        if(customersSsn.containsKey(cSsn)) {
            return false;
        }
        return true;
    }

    public Boolean containsId(int cId) {
        if(customersId.containsKey(cId)) {
            return true;
        }
        return false;
    }

    // public Customer getCustomerById(int cId) {
    //     return new Customer();
    // }

    // public Customer getCustomerBySSN(int cSsn) {
    //     return new Customer();
    // }

    public void printCustomers() {
        Set<Map.Entry<Integer,Customer>> set = customersId.entrySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            Map.Entry mentry = (Map.Entry)iter.next();
            System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
            Customer c = (Customer)mentry.getValue();
            c.printCustomer();
        }
    }
}