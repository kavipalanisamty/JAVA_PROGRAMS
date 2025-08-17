public class PrintingFirstKWords {
    public static void main(String[] args) {
        String str = "Please Subscribe Tekno UF UBK ANNA Channel";
        String[] arr = str.split(" ");
        int k = 4;
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
