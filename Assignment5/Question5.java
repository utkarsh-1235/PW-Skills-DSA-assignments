package Assignment5;

public class Question5 {
        public static int findDistanceValue(int[] arr1, int[] arr2, int d) {
            int count = 0;
    
            for (int num1 : arr1) {
                boolean isDistanceGreater = true;
    
                for (int num2 : arr2) {
                    if (Math.abs(num1 - num2) <= d) {
                        isDistanceGreater = false;
                        break;
                    }
                }
    
                if (isDistanceGreater) {
                    count++;
                }
            }
    
            return count;
        }
    
        public static void main(String[] args) {
            int[] arr1 = {4, 5, 8};
            int[] arr2 = {10, 9, 1, 8};
            int d = 2;
            int distanceValue = findDistanceValue(arr1, arr2, d);
            System.out.println(distanceValue); // Output: 2
        }
    }
    

