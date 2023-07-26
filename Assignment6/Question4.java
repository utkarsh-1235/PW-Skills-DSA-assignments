package Assignment6;

import java.util.HashMap;
import java.util.Map;

public class Question4 {
    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxLen = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count += nums[i] == 0 ? -1 : 1;

            if (count == 0) {
                // If the count is zero, it means the subarray from index 0 to i has equal 0s and 1s.
                maxLen = i + 1;
            } else if (countMap.containsKey(count)) {
                // If the count is already present in the map, it means the subarray between the current index
                // and the previous occurrence of the same count has equal 0s and 1s.
                maxLen = Math.max(maxLen, i - countMap.get(count));
            } else {
                // If the count is not present in the map, add it to the map along with its index.
                countMap.put(count, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        int maxLength = findMaxLength(nums);
        System.out.println(maxLength); // Output: 2
    }
}


