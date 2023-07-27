public class Question1{
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1}; // Add 1 to adjust for 1-indexed array
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // If no solution is found, you can return null or throw an exception.
        // In this case, we return an empty array to indicate no solution.
        return new int[0];
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(numbers, target);
        for (int num : result) {
            System.out.print(num + " "); // Output: 1 2
        }
    }

}