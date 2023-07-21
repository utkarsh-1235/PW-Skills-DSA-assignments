import java.util.Arrays;
public class Question4 {


    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        Question4 solution = new Question4();
        int[] nums = {1, 4, 3, 2};
        int result = solution.arrayPairSum(nums);
        System.out.println(result); // Output: 4
    }
}


