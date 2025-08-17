public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,4,6,7,8,9,10};
        int arr_size = arr.length;

        int total_sum = (arr_size * (arr_size + 1))/2;
        System.out.println(total_sum);

        for(int ind = 0; ind < arr_size; ind++){
            total_sum -= arr[ind];
        }

        System.out.println(total_sum);
    }
}
