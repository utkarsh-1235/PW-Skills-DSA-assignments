public class Question6 {
        public static int firstBadVersion(int n) {
            int left = 1;
            int right = n;
    
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (isBadVersion(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
    
            return left;
        }
    
        // Assume this method is provided by the API.
        private static boolean isBadVersion(int version) {
            // Implementation of the API method to check if a version is bad.
            // You may replace this with the actual implementation in your system.
            // For example, you could have an array of versions and check if the version is bad.
            return version >= 4; // For the given example, version 4 is the first bad version.
        }
    
        public static void main(String[] args) {
            int n = 5;
            int firstBadVersion = firstBadVersion(n);
            System.out.println("First Bad Version: " + firstBadVersion); // Output: 4
        }
    }
    

