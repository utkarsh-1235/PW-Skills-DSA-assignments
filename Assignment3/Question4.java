public class Question4 {
     public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
    
            while (left <= right) {
                int mid = left + (right - left) / 2;
    
                if (nums[mid] == target) {
                    return mid; // Target found at index mid
                } else if (nums[mid] < target) {
                    left = mid + 1; // Continue searching in the right half
                } else {
                    right = mid - 1; // Continue searching in the left half
                }
            }
    
            // Target not found, return the index where it would be inserted
            return left;
        }
    
        public static void main(String[] args) {
            Question4 solution = new Question4();
            int[] nums = {1, 3, 5, 6};
            int target = 5;
            int index = solution.searchInsert(nums, target);
            System.out.println(index); // Output: 2
        }
    }
        
