public class Question8 {
      public int minimizeScore(int[] nums, int k) {
            int minVal = Integer.MAX_VALUE;
            int maxVal = Integer.MIN_VALUE;
            
            for (int num : nums) {
                minVal = Math.min(minVal, num);
                maxVal = Math.max(maxVal, num);
            }
            
            if (maxVal - minVal <= 2 * k) {
                return 0;
            }
            
            return maxVal - minVal - 2 * k;
        }
    
        public static void main(String[] args) {
            int[] nums = {1};
            int k = 0;
            Question8 ms = new Question8();
            int minScore = ms.minimizeScore(nums, k);
            System.out.println("Minimum score: " + minScore);
        }
    }
    

