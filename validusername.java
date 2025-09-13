import java.util.Scanner;
import java.util.regex.Pattern;

class UsernameValidator {
    public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
}
public class validusername {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        
        while (n-- != 0) {
            String userName = scanner.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        scanner.close();
    }
}
