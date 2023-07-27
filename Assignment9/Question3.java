public class Question3{
        public static int findPeakElement(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
    
            while (left < right) {
                int mid = left + (right - left) / 2;
    
                if (nums[mid] < nums[mid + 1]) {
                    // Move towards the direction of the greater neighbor.
                    left = mid + 1;
                } else {
                    // Move towards the direction of the greater neighbor.
                    right = mid;
                }
            }
    
            return left;
        }
    
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 1};
            int peakIndex = findPeakElement(nums);
            System.out.println("Peak element index: " + peakIndex); // Output: 2
        }
    }
    
