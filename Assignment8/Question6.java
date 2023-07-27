import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question6{

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }

        Map<Character, Integer> targetCharCount = new HashMap<>();
        for (char c : p.toCharArray()) {
            targetCharCount.put(c, targetCharCount.getOrDefault(c, 0) + 1);
        }

        int requiredChars = targetCharCount.size();
        int windowStart = 0;
        int windowEnd = 0;
        int formed = 0;
        Map<Character, Integer> windowCharCount = new HashMap<>();

        while (windowEnd < s.length()) {
            char endChar = s.charAt(windowEnd);
            windowCharCount.put(endChar, windowCharCount.getOrDefault(endChar, 0) + 1);

            if (targetCharCount.containsKey(endChar) && windowCharCount.get(endChar).equals(targetCharCount.get(endChar))) {
                formed++;
            }

            while (windowEnd - windowStart + 1 == p.length()) {
                if (formed == requiredChars) {
                    result.add(windowStart);
                }

                char startChar = s.charAt(windowStart);
                if (targetCharCount.containsKey(startChar) && windowCharCount.get(startChar).equals(targetCharCount.get(startChar))) {
                    formed--;
                }

                windowCharCount.put(startChar, windowCharCount.get(startChar) - 1);
                if (windowCharCount.get(startChar) == 0) {
                    windowCharCount.remove(startChar);
                }

                windowStart++;
            }

            windowEnd++;
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = findAnagrams(s, p);
        System.out.println(result); // Output: [0, 6]
    }
}

