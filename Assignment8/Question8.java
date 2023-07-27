public class Question8 {

        public static boolean canBeEqualBySwap(String s, String goal) {
            if (s.length() != goal.length()) {
                return false;
            }
    
            int firstMismatchIndex = -1;
            int secondMismatchIndex = -1;
    
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (firstMismatchIndex == -1) {
                        firstMismatchIndex = i;
                    } else if (secondMismatchIndex == -1) {
                        secondMismatchIndex = i;
                    } else {
                        return false; // More than two mismatches found, cannot be made equal by swap.
                    }
                }
            }
    
            // If both indexes are not -1, then exactly two mismatches were found.
            if (firstMismatchIndex != -1 && secondMismatchIndex != -1) {
                return s.charAt(firstMismatchIndex) == goal.charAt(secondMismatchIndex)
                        && s.charAt(secondMismatchIndex) == goal.charAt(firstMismatchIndex);
            }
    
            // If only one mismatch is found, no swap is required, strings are already equal.
            return firstMismatchIndex == -1;
        }
    
        public static void main(String[] args) {
            String s = "ab";
            String goal = "ba";
            boolean result = canBeEqualBySwap(s, goal);
            System.out.println("Can be equal by swap? " + result); // Output: true
        }
    }
    

