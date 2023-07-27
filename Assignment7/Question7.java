package Assignment7;

import java.util.Stack;
public class Question7 {
    public static boolean backspaceCompare(String s, String t) {
        return buildProcessedString(s).equals(buildProcessedString(t));
    }

    private static String buildProcessedString(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return String.valueOf(stack);
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        boolean result = backspaceCompare(s, t);
        System.out.println(result); // Output: true
    }
}


