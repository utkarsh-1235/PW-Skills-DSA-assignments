import java.util.*;
public class Question2 {
    public List<List<Integer>> findDisjointNumbers(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        List<Integer> distinctNums1 = new ArrayList<>();
        List<Integer> distinctNums2 = new ArrayList<>();

        for (int num : set1) {
            if (!set2.contains(num)) {
                distinctNums1.add(num);
            }
        }

        for (int num : set2) {
            if (!set1.contains(num)) {
                distinctNums2.add(num);
            }
        }

        List<List<Integer>> answer = new ArrayList<>();
        answer.add(distinctNums1);
        answer.add(distinctNums2);

        return answer;
    }

    public static void main(String[] args) {
        Question2 solution = new Question2();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> result = solution.findDisjointNumbers(nums1, nums2);
        System.out.println(result); // Output: [[1, 3], [4, 6]]
    }
}


