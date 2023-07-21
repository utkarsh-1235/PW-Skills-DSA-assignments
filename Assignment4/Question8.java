import java.util.Arrays;
public class Question8 {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];
            result[index++] = nums[i + n];
        }

        return result;
    }

    public static void main(String[] args) {
        Question8 solution = new Question8();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = solution.shuffle(nums, n);
        System.out.println(Arrays.toString(result)); // Output: [2, 3, 5, 4, 1, 7]
    }
}

