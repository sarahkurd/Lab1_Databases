import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        // collection objects
        CustomerCollection cc = new CustomerCollection();
        CreditCardCollection creditCardColl = new CreditCardCollection();
        OwnershipCollection oc = new OwnershipCollection();

        Boolean showMenu = true;
        while(showMenu) {

            // print menu
            System.out.println("------ Menu -----");
            System.out.println("Commands for updates: ");
            System.out.println("u1: Create a new customer");
            System.out.println("u2: Create a new credit card for an existing customer");
            System.out.println("u3: Issue a credit card duplicate for additional customer");
            System.out.println("u4: Cancel a credit card");
            System.out.println("u5: Activate a credit card");
            System.out.println("u6: Add a new vendor");
            System.out.println("u7: Create a new transaction");
            System.out.println("u8: Allow a customer to pay off credit card");

            // create a Scanner object
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            // check selected choice
            if(choice.equals("u1")) {
                System.out.println("Enter name: ");
                String name = sc.nextLine();
                System.out.println("Enter ssn: ");
                String ssn = sc.nextLine();
                if(ssn.length() != 9) {
                    System.out.println("The ssn you entered is invalid");
                    System.out.println("Enter ssn (9 digits): ");
                    ssn = sc.nextLine();
                } else if(cc.checkSsn(Integer.parseInt(ssn)) == false) {
                    System.out.println("The ssn you entered is not unique");
                    System.out.println("Enter ssn (9 digits): ");
                    ssn = sc.nextLine();
                }
                System.out.println("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter phone: ");
                String phone = sc.nextLine();
                if(phone.length() != 10) {
                    System.out.println("The phone you entered is invalid");
                    System.out.println("Enter phone (10 digits): ");
                    phone = sc.nextLine();
                }
                Customer c = new Customer(Integer.parseInt(ssn), name, address, Long.parseLong(phone));
                cc.addCustomer(c);
                System.out.println("Customer added successfully! ");
                cc.printCustomers();
                System.out.println();
            } else if(choice.equals("u2")) {
                System.out.println("Enter credit card owner id: ");
                String cId = sc.nextLine();
                // while customer does not exist, prompt for valid customer
                while(!cc.containsId(Integer.parseInt(cId))) {
                    System.out.println("Customer does not exist. Enter valid customer id: ");
                    cId = sc.nextLine();
                }
                System.out.println("Valid customer. Now Enter Card Info.");
                System.out.println("Credit Card Type (Visa, MasterCard, AmericanExpress, Discover): ");
                String type = sc.nextLine();
                Type cType = Type.valueOf(type);
                System.out.println("Credit Card Limit: ");
                String cLimit = sc.nextLine();
                System.out.println("Current Balance: ");
                String cBalance = sc.nextLine();
                CreditCard creditCard = new CreditCard(cType, Integer.parseInt(cLimit), Double.parseDouble(cBalance));
                System.out.println("Card Created with info:");
                creditCard.printCardInfo();
                Ownership own = new Ownership(Integer.parseInt(cId), creditCard.getId());

                // add data to both credit card and ownership structures
                creditCardColl.addCreditCard(creditCard);
                System.out.println("Card added to collection");
                oc.addOwnership(own);
                System.out.println("Card added to ownerships");
                System.out.println();
                System.out.println("Credit Card Collection");
                creditCardColl.printCreditCards();
                System.out.println();
                System.out.println("Ownership Collection");
                oc.printOwnerships();
            } else if(choice.equals("z")) {
                showMenu = false;
            }
            
        }
    }      
}
