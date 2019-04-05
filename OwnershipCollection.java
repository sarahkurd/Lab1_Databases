import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class OwnershipCollection {

    HashMap ownerships = new HashMap<Integer, Ownership>();

    public void addOwnership(Ownership own) {
        ownerships.put(own.getCustomerId(), own);
    }

    public void printOwnerships() {
        Set<Map.Entry<Integer,Ownership>> set = ownerships.entrySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            Map.Entry mentry = (Map.Entry)iter.next();
            Ownership o = (Ownership)mentry.getValue();
            o.printOwnership();
        }
    }
}