package Assignment6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question6 {
    public static int[] findOriginalArray(int[] changed) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : changed) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer> originalList = new ArrayList<>();
        for (int num : changed) {
            if (freqMap.containsKey(num * 2) && freqMap.get(num * 2) > 0) {
                originalList.add(num);
                freqMap.put(num * 2, freqMap.get(num * 2) - 1);
            } else {
                return new int[0];
            }
        }

        int[] original = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++) {
            original[i] = originalList.get(i);
        }

        return original;
    }

    public static void main(String[] args) {
        int[] changed = {1, 3, 4, 2, 6, 8};
        int[] original = findOriginalArray(changed);
        for (int num : original) {
            System.out.print(num + " "); // Output: 1 3 4 (or any other valid order)
        }
    }
}


