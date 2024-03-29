import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jessicahuffstutler on 10/9/15.
 */
public class User {
    String name;

    void chooseName(HashMap<String, Double> accounts) throws Exception {
        System.out.println("Welcome to your bank's ATM! What is your name?");
        name = ATM.nextLine();
        if (name.equals("")) {
            System.out.println("Please enter a valid name.");
        } else if (!accounts.containsKey(name)) {
            System.out.println("We do not have an account on file for you. Would you like to create an account? [y/n]");
            String s = ATM.nextLine();
            if (s.equals("y")) {
                System.out.println("Creating account..."); //add in "How much would you like to deposit?" and the ability to deposit money
                accounts.put(name, 0.0);
            } else if (s.equals("n")) {
                chooseName(accounts);
            }
        } else
            System.out.println("Hello, " + name);
    }

    void chooseToDo(HashMap<String, Double> accounts) throws Exception {
        System.out.println("What would you like to do?");
        System.out.println("[1] Check my balance");
        System.out.println("[2] Withdraw funds");
        System.out.println("[3] Remove Account");
        System.out.println("[4] Cancel");
        double balance = accounts.get(name);
        String toDo = ATM.nextLine();
        if (toDo.equals("1")) {
            System.out.println("Your balance is " + balance);
            chooseToDo(accounts);
        } else if (toDo.equals("2")) {
            System.out.println("How much money would you like to withdraw?");
            int amount = ATM.nextInt();
            if (amount > balance) {
                System.out.println("Please enter an amount less than or equal to your current balance.");
            } else
                System.out.println("Please take your cash.");
                chooseToDo(accounts);
        } else if (toDo.equals("3")) {
            System.out.println("Account Removed.");
            accounts.remove(name);
            chooseName(accounts); //another example of how to call a loop
        } else if (toDo.equals("4")) {
            System.out.println("Thank you and please come again.");
            System.exit(0);
        }
    }
}
