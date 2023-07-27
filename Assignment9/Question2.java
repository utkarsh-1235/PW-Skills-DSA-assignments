public class Question2{


    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        // Find the leftmost index of the target.
        int left = findLeftmostIndex(nums, target);
        if (left == -1) {
            return result; // Target not found, return [-1, -1].
        }

        // Find the rightmost index of the target.
        int right = findRightmostIndex(nums, target);

        result[0] = left;
        result[1] = right;
        return result;
    }

    private static int findLeftmostIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] < target) {
                    return mid; // Found leftmost index of the target.
                } else {
                    right = mid - 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found.
    }

    private static int findRightmostIndex(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                if (mid == nums.length - 1 || nums[mid + 1] > target) {
                    return mid; // Found rightmost index of the target.
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found.
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        for (int num : result) {
            System.out.print(num + " "); // Output: 3 4
        }
    }
}

