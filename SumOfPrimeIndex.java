public class SumOfPrimeIndex {
    static boolean Isprime(int num){
        if ( num <= 1)
            return false;
        if( num == 2 || num == 3)
            return true;
        for(int ind = 2; ind <= num /2 ; ind++){
            if(num%ind == 0){
                return false;
            }           
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int arr_len = arr.length;
        int totalSum = 0;
        for(int ind = 0; ind < arr_len; ind++){
            if(Isprime(ind)){
                System.out.print(arr[ind]+" ");
                totalSum += arr[ind];
            }
        }

        System.out.println(totalSum);
    }
}
