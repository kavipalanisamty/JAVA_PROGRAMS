import java.util.Scanner;

public class Arrays{
    public static void main(String[] args){
        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int ind =0 ; ind < 10; ind++){
            arr[ind] = sc.nextInt();
        }

        for(int ind =0 ; ind < 10; ind++){
            System.out.println(arr[ind]);
        }

        sc.close();
    }
}