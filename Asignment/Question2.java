//import java.util.*;
public class Question2 {
    public static int ques(int arr[], int val){
            int k = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=val){
                    arr[k] = arr[i];
                    k++;
                }
            }
            return k;
    }
    public static void main(String args[]){
        int arr[] = {3,2,2,3};
        int val = 3;
        
        int k = ques(arr, val);
           System.out.println("k ="+k);

           System.out.print("[");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]);
            if(i<k-1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
