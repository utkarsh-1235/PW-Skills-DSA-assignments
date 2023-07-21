import java.util.Arrays;
public class Question1 {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int closestSum = Integer.MAX_VALUE;
            
            for (int i = 0; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        return sum;
                    }
                    
                    if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                        closestSum = sum;
                    }
                    
                    if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            
            return closestSum;
        }
    
        public static void main(String[] args) {
            Question1 solution = new Question1();
            int[] nums = {-1, 2, 1, -4};
            int target = 1;
            int result = solution.threeSumClosest(nums, target);
            System.out.println(result); // Output: 2
        }
    }
        

