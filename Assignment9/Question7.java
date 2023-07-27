public class Question7 {

        public static int countInversions(int[] arr) {
            int[] temp = new int[arr.length];
            return mergeSortAndCount(arr, temp, 0, arr.length - 1);
        }
    
        private static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
            int count = 0;
    
            if (left < right) {
                int mid = left + (right - left) / 2;
    
                count += mergeSortAndCount(arr, temp, left, mid);
                count += mergeSortAndCount(arr, temp, mid + 1, right);
                count += mergeAndCount(arr, temp, left, mid, right);
            }
    
            return count;
        }
    
        private static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
            int i = left;
            int j = mid + 1;
            int k = left;
            int count = 0;
    
            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j]) {
                    temp[k] = arr[i];
                    i++;
                } else {
                    temp[k] = arr[j];
                    j++;
                    count += (mid - i + 1); // Count inversions during the merge step.
                }
                k++;
            }
    
            while (i <= mid) {
                temp[k] = arr[i];
                i++;
                k++;
            }
    
            while (j <= right) {
                temp[k] = arr[j];
                j++;
                k++;
            }
    
            System.arraycopy(temp, left, arr, left, right - left + 1);
            return count;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 4, 1, 3, 5};
            int inversions = countInversions(arr);
            System.out.println("Number of inversions: " + inversions); // Output: 3
        }
    }
    

