import java.util.*;
public class Question1 {
    public static int question(int arr[]){
        int n = arr.length;
         
         int sum = 0;
         Arrays.sort(arr);
        for(int i=0;i<n;i=i+2){
           sum =+ arr[i]; 
        }
        return sum;
    }

    public static void main(String args[]){
        int arr[] = {1,4,3,2};

        System.out.println(question(arr));
    }
}
