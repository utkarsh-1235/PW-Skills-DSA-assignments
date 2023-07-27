public class Question3 {


        public static int minSteps(String word1, String word2) {
            int m = word1.length();
            int n = word2.length();
    
            // Initialize a 2D DP array to store the minimum steps to make substrings equal
            int[][] dp = new int[m + 1][n + 1];
    
            // Fill in the DP array
            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
    
            int commonLength = dp[m][n];
            int totalSteps = m + n - 2 * commonLength; // Total steps = steps in word1 + steps in word2 - 2 * common steps
            return totalSteps;
        }
    
        public static void main(String[] args) {
            String word1 = "sea";
            String word2 = "eat";
            int result = minSteps(word1, word2);
            System.out.println("Minimum steps required: " + result); // Output: 2
        }
    }
    

