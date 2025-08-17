public class PushingZerostoRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int arr_len = arr.length;
        int count = 0;

        for (int ind = 0; ind < arr_len; ind++) {
            if (arr[ind] != 0) {
                arr[count] = arr[ind];
                count++;
            }
        }
        while (count < arr_len) {
            arr[count] = 0;
            count++;
        }
        for (int ind = 0; ind < arr_len; ind++) {
            System.out.print(arr[ind] + " ");
        }
    }
}
