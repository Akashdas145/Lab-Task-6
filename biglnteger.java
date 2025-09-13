import java.math.BigInteger;
import java.util.Scanner;

public class biglnteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        BigInteger sum = A.add(B);
        BigInteger product = A.multiply(B);

        System.out.println(sum);
        System.out.println(product);

        scanner.close();
    }
}
