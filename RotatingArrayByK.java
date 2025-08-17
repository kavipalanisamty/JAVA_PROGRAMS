public class RotatingArrayByK {
    public static void main(String[] args) {
        
        int n = 7;
        int arr[] = {1,2,3,4,5,6,7};
        int k = 2;

        k = k % n;
        int temp[] = new int[k];

        for(int ind = n - k; ind < n; ind++){
            temp[ind-n+k] = arr[ind];
        }
       
       
        for(int ind = n-k-1; ind >= 0; ind--){
             arr[ind + k] = arr[ind];
             
        }

        for(int ind = 0; ind < k; ind++){
            arr[ind] = temp[ind];
        }

        for(int ind =0; ind < n; ind++){
            System.out.println(arr[ind]);
        }


    }
}
