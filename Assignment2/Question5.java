import java.util.Arrays;
public class Question5 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int maxProduct1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int maxProduct2 = nums[0] * nums[1] * nums[nums.length - 1];
        
        return Math.max(maxProduct1, maxProduct2);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Question5 mp = new Question5();
        int maxProduct = mp.maximumProduct(nums);
        System.out.println("Maximum product of three numbers: " + maxProduct);
    }
}

