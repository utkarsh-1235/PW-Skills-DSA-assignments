import java.util.ArrayList;
import java.util.List;
public class Question7 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ranges = new ArrayList<>();
        int prev = lower - 1;

        for (int num : nums) {
            if (num - prev > 1) {
                ranges.add(getRange(prev + 1, num - 1));
            }
            prev = num;
        }

        if (upper - prev > 0) {
            ranges.add(getRange(prev + 1, upper));
        }

        return ranges;
    }

    private String getRange(int start, int end) {
        if (start == end) {
            return String.valueOf(start);
        } else {
            return start + "->" + end;
        }
    }

    public static void main(String[] args) {
        Question7 solution = new Question7();
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<String> result = solution.findMissingRanges(nums, lower, upper);
        System.out.println(result); // Output: ["2", "4->49", "

}
}