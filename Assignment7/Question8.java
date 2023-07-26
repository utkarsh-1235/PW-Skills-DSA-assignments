package Assignment7;

public class Question8 {
  public static boolean checkStraightLine(int[][] coordinates) {
            // If there are fewer than 3 points, they always form a straight line.
            if (coordinates.length < 3) {
                return true;
            }
    
            // Calculate the slope between the first two points.
            int x1 = coordinates[0][0];
            int y1 = coordinates[0][1];
            int x2 = coordinates[1][0];
            int y2 = coordinates[1][1];
    
            // Check for the special case where the slope is undefined (vertical line).
            if (x2 - x1 == 0) {
                // If all points have the same x-coordinate, they form a straight line.
                for (int i = 2; i < coordinates.length; i++) {
                    if (coordinates[i][0] != x1) {
                        return false;
                    }
                }
                return true;
            }
    
            // Calculate the initial slope.
            double slope = (double) (y2 - y1) / (x2 - x1);
    
            // Check the remaining points.
            for (int i = 2; i < coordinates.length; i++) {
                int x_i = coordinates[i][0];
                int y_i = coordinates[i][1];
    
                // If the slope between any other pair of points is different,
                // then the points do not form a straight line.
                if ((x_i - x1) != 0 && (double) (y_i - y1) / (x_i - x1) != slope) {
                    return false;
                }
            }
    
            // If all slopes are the same, the points form a straight line.
            return true;
        }
    
        public static void main(String[] args) {
            // Example usage:
            int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
            System.out.println(checkStraightLine(coordinates)); // Output: true
        }
    }
       

