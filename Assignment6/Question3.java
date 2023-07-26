package Assignment6;

public class Question3 {
        public static boolean validMountainArray(int[] arr) {
            int n = arr.length;
            int i = 0;
    
            // Step 1: Check if the array is at least of length 3
            if (n < 3) {
                return false;
            }
    
            // Step 2: Find the peak
            while (i < n - 1 && arr[i] < arr[i + 1]) {
                i++;
            }
    
            // Check if i is the start or end of the array (not a valid peak)
            if (i == 0 || i == n - 1) {
                return false;
            }
    
            // Check if the elements after the peak are strictly decreasing
            while (i < n - 1 && arr[i] > arr[i + 1]) {
                i++;
            }
    
            // If i reaches the end of the array, then it's a valid mountain array
            return i == n - 1;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 1};
            boolean result = validMountainArray(arr);
            System.out.println(result); // Output: false
        }
    }
    

