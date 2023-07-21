public class Question6 {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result ^= num;
            }
            return result;
        }
    
        public static void main(String[] args) {
            Question6 solution = new Question6();
            int[] nums = {2, 2, 1};
            int result = solution.singleNumber(nums);
            System.out.println(result); // Output: 1
        }
    }
    

