import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int ind=0;ind<n; ind++){
            arr[ind]=sc.nextInt();
        }
        
        int temp;
        for(int ind = 0; ind < n/2; ind++){
            temp = arr[ind];
            arr[ind] = arr[n - ind - 1];
            arr[n-ind-1] = temp;
        }

        for(int ind=0;ind<n; ind++){
            System.out.print(arr[ind]);
        }

        sc.close();


    }
}
