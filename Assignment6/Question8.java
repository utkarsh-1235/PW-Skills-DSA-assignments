package Assignment6;
public class Question8 {
        public static int[][] multiply(int[][] mat1, int[][] mat2) {
            int m = mat1.length;
            int k = mat1[0].length;
            int n = mat2[0].length;
    
            int[][] result = new int[m][n];
    
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int x = 0; x < k; x++) {
                        result[i][j] += mat1[i][x] * mat2[x][j];
                    }
                }
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[][] mat1 = {{1, 0, 0}, {-1, 0, 3}};
            int[][] mat2 = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};
    
            int[][] result = multiply(mat1, mat2);
            for (int[] row : result) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
    



