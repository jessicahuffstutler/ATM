import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jessicahuffstutler on 10/9/15.
 */
public class User {
    String name;
    String toDo;
    HashMap<String, Double> accounts = new HashMap();

    void chooseName() throws Exception {
        System.out.println("Welcome to your bank's ATM! What is your name?");
        name = ATM.nextLine();
        if (name.equals("")) {
            System.out.println("Please enter a valid name."); //now shows a null pointer exception when used
        } else if (!accounts.containsKey(name)) {
            System.out.println("We do not have an account on file for you. Would you like to create an account? [y/n]");
            String s = ATM.nextLine();
            if (s.equals("y")) { //if there is no "if (s.equals("n"))" -> java.lang.NullPointerException
                System.out.println("Creating account...");
                accounts.put(name, 0.0);
            } else if (s.equals("n")) { //now shows a null pointer exception when used
                chooseName();
            }
        } else
            System.out.println("Hello, " + name);
    }

    void chooseToDo() throws Exception {
        System.out.println("What would you like to do?");
        System.out.println("[1] Check my balance");
        System.out.println("[2] Withdraw funds");
        System.out.println("[3] Remove Account");
        System.out.println("[4] Cancel");
        double balance = accounts.get(name);
        String toDo = ATM.nextLine();
        if (toDo.equals("1")) {
            System.out.println("Your balance is " + balance);
        } else if (toDo.equals("2")) {
            System.out.println("How much money would you like to withdraw?");
            int amount = ATM.nextInt();
            if (amount > balance) {
                System.out.println("Please enter an amount less than or equal to your current balance.");
            } else
                System.out.println("Please take your cash.");
        } else if (toDo.equals("3")) {
            System.out.println("Account Removed.");
        } else if (toDo.equals("4")) {
            System.out.println("Thank you and please come again.");
            System.exit(0);
        }
    }
}
