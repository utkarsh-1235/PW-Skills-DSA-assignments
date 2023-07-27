import java.util.Stack;
public class Question2 {

    public static boolean isValid(String s) {
        Stack<Integer> openStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                openStack.push(i);
            } else if (c == '*') {
                starStack.push(i);
            } else { // c == ')'
                if (!openStack.isEmpty()) {
                    openStack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false;
                }
            }
        }

        // Matching remaining '*' with '('
        while (!openStack.isEmpty() && !starStack.isEmpty()) {
            if (openStack.pop() > starStack.pop()) {
                return false;
            }
        }

        return openStack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        boolean result = isValid(s);
        System.out.println("Is the string valid? " + result); // Output: true
    }
}


