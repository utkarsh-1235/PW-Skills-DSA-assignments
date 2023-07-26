package Assignment5;

public class Question7 {
        public static int findMin(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
    
            while (left < right) {
                int mid = left + (right - left) / 2;
    
                if (nums[mid] < nums[right]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
    
            return nums[left];
        }
    
        public static void main(String[] args) {
            int[] nums = {3, 4, 5, 1, 2};
            int minElement = findMin(nums);
            System.out.println(minElement); // Output: 1
        }
    }
    

