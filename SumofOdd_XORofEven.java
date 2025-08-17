public class SumofOdd_XORofEven {
    public static void main(String[] args) {
        int[] arr ={10,5,6,3,7,2};
        int arr_len = 6;
        int even = 0;
        int sum = 0;
        for(int ind = 0; ind < arr_len; ind++){
            if(ind%2 == 0){
                even ^= arr[ind];
            }
            else{
                sum+= arr[ind];
            }
        }

        System.out.println(sum-even);
    }
}
