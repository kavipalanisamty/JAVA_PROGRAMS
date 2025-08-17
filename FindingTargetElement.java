public class FindingTargetElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,10,40};
        int target = 10;
        int arr_len = arr.length;

        for(int ind = 0; ind < arr_len; ind++){
            if( target == arr[ind])
                System.out.print(ind);
        }
    }
}
