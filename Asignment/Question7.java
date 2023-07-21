public class Question7 {
    public static void arrange0s(int arr[]){
        int i = 0;
        int j=0;

        while(j<arr.length){
            if(arr[j]!=0){
                arr[i] = arr[j];
                i++;
            }
            j++;
        }
        while(i<arr.length){
            arr[i]=0;
            i++;
        }
    }
    public static void main(String args[]){
        int arr[] = {0,1,0,3,12};
        arrange0s(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
