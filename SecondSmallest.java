import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int ind=0;ind<n; ind++){
            arr[ind]=sc.nextInt();
        }

        int smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;
        
        for(int ind = 0; ind < n; ind++){
            if( smallest > arr[ind]){
                SecondSmallest = smallest;
                smallest = arr[ind];
            }
            else if(arr[ind] != smallest && arr[ind] < smallest){
                SecondSmallest = arr[ind];
            }

        }

        System.out.println(SecondSmallest);
        sc.close();
    }
}
