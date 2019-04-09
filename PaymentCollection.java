import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class PaymentCollection {

    // data structure
    HashMap payments = new HashMap<Integer, Payment>();

    public void addPayment(Payment p) {
        payments.put(p.getId(), p);
    }

    public void printPayments() {
        System.out.println("Payments Collection:");
        Set<Map.Entry<Integer,Payment>> set = payments.entrySet();
        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            Map.Entry mentry = (Map.Entry)iter.next();
            Payment p = (Payment)mentry.getValue();
            p.printPaymentInfo();
        }
    }
}