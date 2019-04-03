import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

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
                System.out.print("Customer info: " + c.getId() + " " + c.getName() + " " + c.getSSN() + " " + c.getAddress() + " " + c.getPhone());
                System.out.println();
            } else if(choice.equals("z")) {
                showMenu = false;
            }
            
        }
    }      
}
