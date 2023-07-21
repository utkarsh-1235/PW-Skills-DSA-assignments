import java.util.Arrays;
public class Question6 {


    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            squares[i] = nums[i] * nums[i];
        }

        Arrays.sort(squares);

        return squares;
    }

    public static void main(String[] args) {
        Question6 solution = new Question6();
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(result)); // Output: [0, 1, 9, 16, 100]
    }
}


