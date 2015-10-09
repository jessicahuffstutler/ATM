import java.util.Scanner;

/**
 * Created by jessicahuffstutler on 10/9/15.
 */
public class ATM {
    public static void run() throws Exception {
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals("")) { //"alt- if (name.isEmpty()) {"
            System.out.println("Please enter a valid name."); //alt- "throw new Exception("Account not found.");"
        } else {
            System.out.println("Hello, " + name);
        }

        System.out.println("What would you like to do?");
        System.out.println("[1] Check my balance");
        System.out.println("[2] Withdraw funds");
        System.out.println("[3] Cancel");
        String toDo = scanner.nextLine();
        if (toDo.equals("1")) {
            System.out.println("Your balance is $100");
        } else if (toDo.equals("2")) {
            System.out.println("How much money would you like to withdraw?");
            int amount = scanner.nextInt();
            if (amount > 100) {
                System.out.println("Please enter an amount less than or equal to your current balance.");
            } else
                System.out.println("Please take your cash."); //alt- "System.out.println("Please take your cash. Your Balance is now " + (100-amount));"
        } else if (toDo.equals("3")) {
            System.out.println("Thank you and please come again.");
        }
    }
}

