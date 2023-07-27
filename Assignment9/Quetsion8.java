import java.util.ArrayList;
import java.util.List;
public class Quetsion8 {
    
        public static List<Integer> findCommonElements(int[] ar1, int[] ar2, int[] ar3) {
            List<Integer> result = new ArrayList<>();
            int p1 = 0; // Pointer for ar1
            int p2 = 0; // Pointer for ar2
            int p3 = 0; // Pointer for ar3
    
            while (p1 < ar1.length && p2 < ar2.length && p3 < ar3.length) {
                if (ar1[p1] == ar2[p2] && ar2[p2] == ar3[p3]) {
                    result.add(ar1[p1]);
                    p1++;
                    p2++;
                    p3++;
                } else if (ar1[p1] < ar2[p2]) {
                    p1++;
                } else if (ar2[p2] < ar3[p3]) {
                    p2++;
                } else {
                    p3++;
                }
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] ar1 = {1, 5, 10, 20, 40, 80};
            int[] ar2 = {6, 7, 20, 80, 100};
            int[] ar3 = {3, 4, 15, 20, 30, 70, 80, 120};
            List<Integer> commonElements = findCommonElements(ar1, ar2, ar3);
            System.out.println("Common Elements: " + commonElements); // Output: [20, 80]
        }
    }
    
    
    

