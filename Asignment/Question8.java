import java.util.*;
public class Question8 {
    public static int[] hashset(int arr[]){
            HashSet<Integer> set = new HashSet<>();
            int result[] = new int[2];

            for(int num : arr){
                if(set.contains(num)){
                    result[0] = num;
                }
                set.add(num);
            }
            for(int i=1;i<arr.length;i++){
                if(!set.contains(i)){
                    result[1] = i;
                    break;
                }
            }
            return result;
    }
    public static void main(String args[]){
        int arr[] = {1,2,2,4};
        int result[] = hashset(arr);

        for(int nums: result){
            System.out.print(nums+" ");
        }



    }
}
