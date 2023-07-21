import java.util.HashMap;

public class Question3 {
    public int findLHS(int[] nums) {
        // Create a HashMap to store the frequency of each number
        HashMap<Integer, Integer> numCounts = new HashMap<>();
        
        // Count the frequency of each number in nums
        for (int num : nums) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }
        
        // Initialize the longest harmonious subsequence length
        int maxLen = 0;
        
        // Iterate through the keys of numCounts
        for (int num : numCounts.keySet()) {
            // Check if numCounts contains num + 1
            if (numCounts.containsKey(num + 1)) {
                maxLen = Math.max(maxLen, numCounts.get(num) + numCounts.get(num + 1));
            }
            
            // Check if numCounts contains num - 1
            if (numCounts.containsKey(num - 1)) {
                maxLen = Math.max(maxLen, numCounts.get(num) + numCounts.get(num - 1));
            }
        }
        
        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        Question3 lcs = new Question3();
        int longestSubsequenceLength = lcs.findLHS(nums);
        System.out.println("Length of the longest harmonious subsequence: " + longestSubsequenceLength);
    }
}

