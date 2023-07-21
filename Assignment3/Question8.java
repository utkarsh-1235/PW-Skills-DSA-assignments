import java.util.Arrays;
public class Question8 {


    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < intervals[i - 1][1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Question8 solution = new Question8();
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean result = solution.canAttendMeetings(intervals);
        System.out.println(result); // Output: false
    }
}


