import java.util.Scanner; 
import java.util.regex.Pattern;

class MyRegex {
    String pattern = "^(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\."
                   + "(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\."
                   + "(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\."
                   + "(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})$";
}

public class javaregex {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyRegex myRegex = new MyRegex();
        Pattern pattern = Pattern.compile(myRegex.pattern);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(pattern.matcher(input).matches());
        }
        scanner.close();
    }
}