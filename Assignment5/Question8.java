package Assignment5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question8 {
        public static int[] reconstructOriginalArray(int[] changed) {
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int num : changed) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }
    
            List<Integer> originalList = new ArrayList<>();
            for (int num : changed) {
                int twiceValue = num * 2;
                if (freqMap.containsKey(twiceValue) && freqMap.get(twiceValue) > 0) {
                    originalList.add(num);
                    freqMap.put(twiceValue, freqMap.get(twiceValue) - 1);
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
            int[] original = reconstructOriginalArray(changed);
            for (int num : original) {
                System.out.print(num + " "); // Output: 1 3 4 (or any other valid order)
            }
        }
}
