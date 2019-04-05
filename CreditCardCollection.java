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

    // print given credit card information
    public void getCardInfo(int ccId) {
        CreditCard c = (CreditCard)creditCards.get(ccId);
        c.printCardInfo();
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