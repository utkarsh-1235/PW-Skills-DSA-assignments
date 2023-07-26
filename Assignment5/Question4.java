package Assignment5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Question4 {
        public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
            List<Integer> distinctInNums1 = new ArrayList<>();
            List<Integer> distinctInNums2 = new ArrayList<>();
    
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
    
            for (int num : nums1) {
                set1.add(num);
            }
    
            for (int num : nums2) {
                set2.add(num);
            }
    
            for (int num : nums1) {
                if (!set2.contains(num)) {
                    distinctInNums1.add(num);
                }
            }
    
            for (int num : nums2) {
                if (!set1.contains(num)) {
                    distinctInNums2.add(num);
                }
            }
    
            List<List<Integer>> result = new ArrayList<>();
            result.add(distinctInNums1);
            result.add(distinctInNums2);
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] nums1 = {1, 2, 3};
            int[] nums2 = {2, 4, 6};
            List<List<Integer>> answer = findDistinctIntegers(nums1, nums2);
            System.out.println(answer); // Output: [[1, 3], [4, 6]]
        }
    }
       

