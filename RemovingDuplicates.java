public class RemovingDuplicates {

    public static int RemoveDuplicate(int arr[]){

        int in = 0;

        for(int ind = 1; ind < arr.length; ind++){
            if(arr[in] != arr[ind]){
                in++;
                arr[in] = arr[ind];
            }
        }

        return in + 1;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,1,2,2,3,3,4,4};

        int k = RemoveDuplicate(arr);

        for(int ind = 0; ind < k; ind++){
            System.out.println(arr[ind]+" ");
        }
    }
}
