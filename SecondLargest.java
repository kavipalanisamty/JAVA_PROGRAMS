import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int ind=0;ind<n; ind++){
            arr[ind]=sc.nextInt();
        }

        System.out.println(FindingSecondLargest(arr, n));
        sc.close();
    }


    static private int FindingSecondLargest(int arr[], int n){

        int largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;

        for(int ind = 0; ind < n; ind++){
            if(largest < arr[ind]){
                SecondLargest = largest;
                largest = arr[ind];
            }

            else if( arr[ind] != largest && arr[ind]  > SecondLargest){
                SecondLargest = arr[ind];
            }
        }

        return SecondLargest;
    }
}
