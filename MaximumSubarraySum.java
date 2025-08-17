public class MaximumSubarraySum{
    public static void main(String[] args) {
        int[] arr = {3, -1, 2, 5, -6, 3};
        int arr_len = arr.length;

        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for(int ind = 1; ind < arr_len; ind++){
            currentMax = Math.max(arr[ind], currentMax + arr[ind]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        System.out.println(maxSoFar);
    }
}