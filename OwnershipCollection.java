import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class OwnershipCollection {

    HashMap ownerships = new HashMap<Integer, Ownership>();

    public void addOwnership(Ownership own) {
        ownerships.put(own.getCustomerId(), own);
    }

    // check if an specified ownership already exists
    public Boolean checkIfExists(int cId, int ccId) {
        Set<Map.Entry<Integer,Ownership>> owns = ownerships.entrySet();
        Iterator iter = owns.iterator();
        while(iter.hasNext()) {
            Map.Entry mentry = (Map.Entry)iter.next();
            if((Integer)mentry.getKey() == cId) {
                Ownership o = (Ownership)mentry.getValue();
                if(o.getCreditCardId() == ccId) {
                    return true;
                }
            }
        }
        return false;
    }

    // set current bit to false for credit cards with given ccId
    public void cancelCardWithId(int ccId) {
        Set<Map.Entry<Integer,Ownership>> owns = ownerships.entrySet();
        Iterator iter = owns.iterator();
        while(iter.hasNext()) {
            Map.Entry mentry = (Map.Entry)iter.next();
            Ownership o = (Ownership)mentry.getValue();
            if(o.getCreditCardId() == ccId) {
                // set current bit to false
                o.cancelCard(ccId);
            }
        }
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