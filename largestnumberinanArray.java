public class largestnumberinanArray{
    public static void main(String[] args) {
        int[] arr = {1,4,6,7,8,9};
        int size = arr.length;
        int max = arr [0];
        for(int ind = 1; ind < size; ind++){
            if(arr[ind] > max){
                max = arr[ind];
            }
        }

        System.out.println(max);
    }
}