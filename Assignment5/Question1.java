package Assignment5;

import java.util.Arrays;
public class Question1 {

    public static int[][] convertTo2DArray(int[] original, int m, int n) {
        int totalElementsNeeded = m * n;

        if (original.length < totalElementsNeeded) {
            return new int[0][0];
        }

        int[][] result = new int[m][n];

        // Populate the 2D array with elements from the original array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[i * n + j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] originalArray = {1, 2, 3, 4, 5, 6};
        int mValue = 2;
        int nValue = 3;
        int[][] result2DArray = convertTo2DArray(originalArray, mValue, nValue);

        // Print the resulting 2D array
        for (int[] row : result2DArray) {
            System.out.println(Arrays.toString(row));
        }
    }
}


