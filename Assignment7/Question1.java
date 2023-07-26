package Assignment7;

import java.util.HashMap;
public class Question1 {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            // Check if sChar already has a mapping
            if (charMap.containsKey(sChar)) {
                if (charMap.get(sChar) != tChar) {
                    return false; // sChar maps to a different character in t
                }
            } else {
                // Check if tChar is already mapped to a different character in s
                if (charMap.containsValue(tChar)) {
                    return false;
                }
                charMap.put(sChar, tChar);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = isIsomorphic(s, t);
        System.out.println(result); // Output: true
    }
}


