import java.util.Stack;
public class Question7 {

    public static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int num = 0;

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } else if (c == '[') {
                numStack.push(num);
                strStack.push(currentString.toString());
                num = 0;
                currentString = new StringBuilder();
            } else if (c == ']') {
                int repeatTimes = numStack.pop();
                StringBuilder repeatedString = new StringBuilder(strStack.pop());
                for (int i = 0; i < repeatTimes; i++) {
                    repeatedString.append(currentString);
                }
                currentString = repeatedString;
            } else {
                currentString.append(c);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String decodedString = decodeString(s);
        System.out.println("Decoded string: " + decodedString); // Output: "aaabcbc"
    }
}


