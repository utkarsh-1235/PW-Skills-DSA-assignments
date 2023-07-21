public class Question6 {
     public int search(int[] nums, int target) {
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
            
            return -1;
        }
    
        public static void main(String[] args) {
            int[] nums = {-1, 0, 3, 5, 9, 12};
            int target = 9;
            Question6 bs = new Question6();
            int index = bs.search(nums, target);
            System.out.println("Index of target: " + index);
        }
    }
    
