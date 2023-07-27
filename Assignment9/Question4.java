public class Question4 {

        public static int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
    
            // If target is not found, 'left' will be the correct position to insert it.
            return left;
        }
    
        public static void main(String[] args) {
            int[] nums1 = {1, 3, 5, 6};
            int target1 = 5;
            int result1 = searchInsert(nums1, target1);
            System.out.println("Output 1: " + result1); // Output: 2
    
            int[] nums2 = {1, 3, 5, 6};
            int target2 = 7;
            int result2 = searchInsert(nums2, target2);
            System.out.println("Output 2: " + result2); // Output: 4
        }
    }
    

