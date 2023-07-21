public class Question5 {
    public static void merge(int arr1[],int n,int arr2[],int m){
        int i = n-1;
        int j = m-1;
        int k = m+n-1;

        while(i>=0 && j>=0){
            if(arr1[i]< arr2[j]){
                arr1[k] = arr2[j];
                j--;

            }
            else{
                arr1[k] = arr1[i];
                i--;
            }
            k--;
        }
        while(j>=0){
          arr1[k] = arr2[j];
          j--;
          k--;
        }
    }

    public static void main(String args[]){
        int arr1[] = {1,2,3,0,0,0};
        
        int arr2[] = {2,5,6};
        merge(arr1, 3, arr2, 3);

        for(int a : arr1){
            System.out.print(a+" ");
        }

    }
}
