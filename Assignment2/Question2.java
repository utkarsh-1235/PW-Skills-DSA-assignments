import java.util.HashSet;
public class Question2 {
    public int maxDifferentTypes(int[] candyType) {
        // Create a hash set to store the different candy types
        HashSet<Integer> types = new HashSet<>();
        
        // Iterate through each candy in the candyType array
        for (int candy : candyType) {
            types.add(candy);
        }
        
        // Calculate the maximum number of different types Alice can eat
        int maxTypes = Math.min(types.size(), candyType.length / 2);
        
        return maxTypes;
    }

    public static void main(String[] args) {
        int[] candyType = {1, 1, 2, 2, 3, 3};
        Question2 candyTypes = new Question2();
        int maxDifferentTypes = candyTypes.maxDifferentTypes(candyType);
        System.out.println("Maximum number of different types of candies Alice can eat: " + maxDifferentTypes);
    }
}


