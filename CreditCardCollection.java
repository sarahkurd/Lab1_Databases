import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class CreditCardCollection {

    // data structure
    HashMap creditCards = new HashMap<Integer, CreditCard>();

    //add credit card to collection
    public void addCreditCard(CreditCard cc) {
        creditCards.put(cc.getId(), cc);
    }

    // cancel a credit card
    public void cancelCreditCard(int ccId) {
        creditCards.remove(ccId);
    }

    // set given credit card to active 
    public void activateCreditCard(int ccId) {
        CreditCard cc = (CreditCard)creditCards.get(ccId);
        cc.activate();
    }

    // update card balance after a transaction
    public void updateCardBalance(int ccId, double amount) {
        CreditCard cc = (CreditCard)creditCards.get(ccId);
        cc.updateBalance(amount);
    }

    // print given credit card information
    public void getCardInfo(int ccId) {
        CreditCard c = (CreditCard)creditCards.get(ccId);
        c.printCardInfo();
    }

    public Boolean containsId(int ccId) {
        if(creditCards.containsKey(ccId)) {
            return true;
        }
        return false;
    }

    public void printCreditCards() {
        Set<Map.Entry<Integer,CreditCard>> set = creditCards.entrySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            Map.Entry mentry = (Map.Entry)iter.next();
            CreditCard cc = (CreditCard)mentry.getValue();
            cc.printCardInfo();
        }
    }
}