public class Question4 {
    public static int[] add(int arr[]){
            int n = arr.length;
    
            for(int i=n-1;i>=0;i--){
                arr[i] = arr[i]+1;

                if(arr[i] == 10){
                    arr[i] = 0;
                }
                else{
                    return arr;
                }
            }
            int result[] = new int[n+1];
            result[0] = 1;
            return result;
    }

    public static void main(String args[]){
        int arr[] = {1,2,3};
        int nums[] = add(arr);
        for(int num:nums ){
            System.out.print(num);
        }
        
    }
}
