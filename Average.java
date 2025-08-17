public class Average {
    public static void main(String[] args) {
        
        int n = 6;

        int arr[] = {10,20,30,40,50,60};
        int sum = 0;
        for(int ind = 0; ind < n; ind++){

            sum += arr[ind];
        }

        System.out.println(sum/n);
    }
}
