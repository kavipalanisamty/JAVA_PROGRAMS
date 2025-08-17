import java.util.Arrays;
public class Rearranging {
    public static void main(String[] args) {
        
        int n = 6;

        int arr[] = { 8,7,1,6,5,9};

        Arrays.sort(arr);

        for(int ind = 0; ind < n/2; ind++){
            System.out.println(arr[ind]);
        }

        for(int ind = n-1 ; ind >= n/2; ind--){
            System.out.println(arr[ind]);
        }
    }
}
