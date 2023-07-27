public class Question1{


        public static int minimumDeleteSum(String s1, String s2) {
            int m = s1.length();
            int n = s2.length();
    
            // Initialize a 2D DP array to store the minimum ASCII sum of deleted characters
            int[][] dp = new int[m + 1][n + 1];
    
            // Fill in the DP array
            for (int i = m - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        dp[i][j] = dp[i + 1][j + 1];
                    } else {
                        int deleteS1 = dp[i + 1][j] + s1.charAt(i); // Delete s1.charAt(i)
                        int deleteS2 = dp[i][j + 1] + s2.charAt(j); // Delete s2.charAt(j)
                        dp[i][j] = Math.min(deleteS1, deleteS2);
                    }
                }
            }
    
            return dp[0][0];
        }
    
        public static void main(String[] args) {
            String s1 = "sea";
            String s2 = "eat";
            int result = minimumDeleteSum(s1, s2);
            System.out.println("Lowest ASCII Sum of Deleted Characters: " + result); // Output: 231
        }
    }
    
