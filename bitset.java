import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class bitset {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);  
        int m = Integer.parseInt(firstLine[1]); 
        
        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);
        
        for (int i = 0; i < m; i++) {
            String[] line = br.readLine().split(" ");
            String op = line[0];
            int set1 = Integer.parseInt(line[1]);
            int set2orIndex = Integer.parseInt(line[2]);
            
            BitSet bs1 = (set1 == 1) ? bitSet1 : bitSet2;
            
            switch (op) {
                case "AND":
                    BitSet bsAnd = (set2orIndex == 1) ? bitSet1 : bitSet2;
                    bs1.and(bsAnd);
                    break;
                case "OR":
                    BitSet bsOr = (set2orIndex == 1) ? bitSet1 : bitSet2;
                    bs1.or(bsOr);
                    break;
                case "XOR":
                    BitSet bsXor = (set2orIndex == 1) ? bitSet1 : bitSet2;
                    bs1.xor(bsXor);
                    break;
                case "FLIP":
                    bs1.flip(set2orIndex);
                    break;
                case "SET":
                    bs1.set(set2orIndex);
                    break;
                default:
                    break;
            }
            
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }
        
        br.close();
    }
}
