import java.util.Scanner;

public class Smallest {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int ind=0;ind<n; ind++){
            arr[ind]=sc.nextInt();
        }

        int smallest = arr[0];
        for(int ind = 0; ind < n; ind++){
            if(smallest > arr[ind])
                smallest = arr[ind];
        }
        System.out.println(smallest);
        sc.close();
    }
}