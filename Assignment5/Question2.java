package Assignment5;

public class Question2 {
        public static int arrangeCoins(int n) {
            long left = 0;
            long right = n;
            while (left <= right) {
                long mid = left + (right - left) / 2;
                long sum = mid * (mid + 1) / 2;
                if (sum <= n) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return (int) (left - 1);
        }
    
        public static void main(String[] args) {
            int n = 5;
            int completeRows = arrangeCoins(n);
            System.out.println("Number of complete rows: " + completeRows); // Output: 2
        }
    }
    
