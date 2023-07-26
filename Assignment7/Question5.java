package Assignment7;

public class Question5 {
        public static String reverseStr(String s, int k) {
            char[] chars = s.toCharArray();
            int n = chars.length;
    
            for (int start = 0; start < n; start += 2 * k) {
                int left = start;
                int right = Math.min(start + k - 1, n - 1);
    
                while (left < right) {
                    char temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    left++;
                    right--;
                }
            }
    
            return new String(chars);
        }
    
        public static void main(String[] args) {
            String s = "abcdefg";
            int k = 2;
            String result = reverseStr(s, k);
            System.out.println(result); // Output: "bacdfeg"
        }
    }
    

