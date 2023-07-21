import java.util.HashSet;

public class Question6 {
    public static boolean Duplicate(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,1};
        System.out.println(Duplicate(arr));
    }
}
