import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jessicahuffstutler on 10/9/15.
 */
public class ATM {
    static User user;

    public static void main(String[] args) throws Exception {
        user = new User();

        HashMap<String, Double> accounts = new HashMap();

        while (true) {
            user.chooseName(accounts);
            user.chooseToDo(accounts);
        }
    }

    static String nextLine() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

    static int nextInt() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }
}

