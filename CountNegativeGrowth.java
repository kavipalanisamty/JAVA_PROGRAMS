public class CountNegativeGrowth {
    public static void main(String[] args) {
        int[] arr = {5,6,4,5,2,3,4};
        int negative_growth = 0;
        for(int ind = 1; ind < arr.length; ind++){
            if(arr[ind] < arr[ind-1]){
                negative_growth++;
            }
        }

        System.out.println(negative_growth);
    }
}
