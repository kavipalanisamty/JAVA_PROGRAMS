public class Sumofevenpositions{
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        int arr_len = arr.length;
        int sum = 0;
        if(arr_len%2 == 0){
            for(int ind = 1; ind <= arr_len; ind+=2){
                sum += arr[ind];
            }
        }
        else{
            for(int ind = 0; ind <= arr_len; ind+=2){
                sum+=arr[ind];
            }
        }
    System.out.println(sum);
    }
}
