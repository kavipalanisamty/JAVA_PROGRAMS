import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5,6};
        int size = arr.length;

        Arrays.sort(arr);

        if(size % 2 == 0){

            int num1 = (size / 2) - 1;
            int num2 = (size / 2);

            System.out.println((double)(arr[num1] + arr[num2])/2);
        }

        else{
            System.out.println(arr[(size/2)]);
        }

    }
}
