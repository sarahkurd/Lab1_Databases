import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class TransactionCollection {

    HashMap transactions = new HashMap<Integer, Transaction>();

    public void addTransaction(Transaction t) {
        transactions.put(t.getId(), t);
    }

    public void printTransactions() {
        Set<Map.Entry<Integer,Transaction>> set = transactions.entrySet();
        Iterator iter = set.iterator();
        System.out.println("Transaction Collection: ");
        while(iter.hasNext()) {
            Map.Entry mentry = (Map.Entry)iter.next();
            Transaction t = (Transaction)mentry.getValue();
            t.printTransactionInfo();
        }
    }
}