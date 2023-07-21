public class Question7 {
     public boolean isMonotonic(int[] nums) {
            boolean isIncreasing = true;
            boolean isDecreasing = true;
            
            for (int i = 1; i < nums.length; i++) {
                if (isIncreasing && nums[i] < nums[i - 1]) {
                    isIncreasing = false;
                }
                
                if (isDecreasing && nums[i] > nums[i - 1]) {
                    isDecreasing = false;
                }
                
                if (!isIncreasing && !isDecreasing) {
                    return false;
                }
            }
            
            return isIncreasing || isDecreasing;
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 3};
            Question7 ma = new Question7();
            boolean isMonotonic = ma.isMonotonic(nums);
            System.out.println("Is the array monotonic? " + isMonotonic);
        }
    }
    
