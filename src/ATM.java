import java.util.Scanner;

/**
 * Created by jessicahuffstutler on 10/9/15.
 */
public class ATM {
    static User user;

    public static void run() throws Exception {
        user = new User();

        while (true) {
            user.chooseName();
            user.chooseToDo();
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

