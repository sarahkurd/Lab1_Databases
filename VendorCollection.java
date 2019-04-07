import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class VendorCollection {

    HashMap vendors = new HashMap<Integer, Vendor>();

    public void addVendor(Vendor v) {
        vendors.put(v.getId(), v);
    }

    public void removeVendor(int vId) {
        vendors.remove(vId);
    }

    public Boolean containsId(int vId) {
        if(vendors.containsKey(vId)) {
            return true;
        }
        return false;
    }

    public void printVendors() {
        Set<Map.Entry<Integer,Vendor>> set = vendors.entrySet();
        Iterator iter = set.iterator();
        System.out.println("Vendor Collection: ");
        while(iter.hasNext()) {
            Map.Entry mentry = (Map.Entry)iter.next();
            Vendor v = (Vendor)mentry.getValue();
            v.printVendorInfo();
        }
    }

}