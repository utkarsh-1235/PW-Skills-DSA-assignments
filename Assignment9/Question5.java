public class Question5 {

        public static int findMajorityElement(int[] nums) {
            int candidate = nums[0];
            int count = 1;
    
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == candidate) {
                    count++;
                } else {
                    count--;
                    if (count == 0) {
                        candidate = nums[i];
                        count = 1;
                    }
                }
            }
    
            return candidate;
        }
    
        public static void main(String[] args) {
            int[] nums = {3, 3, 4, 2, 4, 4, 2, 4, 4};
            int majorityElement = findMajorityElement(nums);
            System.out.println("Majority Element: " + majorityElement); // Output: 4
        }
    }
    

