import java.util.Arrays;
public class Question5 {


    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            digits[i] += carry;

            if (digits[i] < 10) {
                carry = 0;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (carry == 1) {
            int[] result = new int[n + 1];
            result[0] = 1;
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        Question5 solution = new Question5();
        int[] digits = {1, 2, 3};
        int[] result = solution.plusOne(digits);
        System.out.println(Arrays.toString(result)); // Output: [1, 2, 4]
    }
}


