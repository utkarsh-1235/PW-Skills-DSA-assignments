import java.util.*;
public class Question1{
/*  
Time Complexity for this is O(n2)
  public static int target(int arr[], int target) {
    int n = arr.length;
   int sum = 0;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            sum = arr[i]+arr[j];

            if(sum == target){
                return sum;
                
            }
        }
    }
    return sum;
   }
   public static void main(String args[]){
      int arr[] = {2,7,11,5};
      int target = 9;

      System.out.println(target(arr, target));
   }*/


   // So We use Map having unique key 

   public static int[] Target(int arr[],int target){
    Map<Integer,Integer>map = new HashMap<>();

    for(int i=0;i<arr.length;i++){
        int complement = target-arr[i];

        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }
        map.put(arr[i],i);
    }
    return new int[0];
   }

   public static void main(String args[]){
    int arr[] = {2,7,11,15};
    int target = 9;
    int result[] = Target(arr, target);
    System.out.println("[" + result[0] + ", " + result[1] + "]");
   }
}