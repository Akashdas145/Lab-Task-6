import java.util.Arrays;
import java.util.Scanner;

public class javaangrams {
      static boolean isAnagram(String a, String b) {
     
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        return Arrays.equals(arrA, arrB);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean result = isAnagram(a, b);
        System.out.println(result ? "Anagrams" : "Not Anagrams");
    }
}
