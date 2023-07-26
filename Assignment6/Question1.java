package Assignment6;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    public static int[] reconstructPermutation(String s) {
        int n = s.length() + 1;
        int[] perm = new int[n];

        List<Integer> remaining = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            remaining.add(i);
        }

        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                perm[idx++] = remaining.remove(0);
            } else {
                perm[idx++] = remaining.remove(remaining.size() - 1);
            }
        }

        perm[n - 1] = remaining.get(0);

        return perm;
    }

    public static void main(String[] args) {
        String s = "IDID";
        int[] perm = reconstructPermutation(s);
        for (int num : perm) {
            System.out.print(num + " "); // Output: 0 4 1 3 2 (or any other valid permutation)
        }
    }
}

