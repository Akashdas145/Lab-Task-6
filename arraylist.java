import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt(); 
            ArrayList<Integer> line = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            data.add(line);
        }
        int q = scanner.nextInt(); 
 
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); 
            int y = scanner.nextInt();

            if (x <= data.size() && y <= data.get(x - 1).size() && x > 0 && y > 0) {
                System.out.println(data.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
