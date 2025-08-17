public class EvenOdd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int print_len = 3;
        String str = "";
        for(int ind = 0; ind < print_len; ind++){
            if(ind%2 == 0)
                str += "even ";
            else    
                str += "odd ";
        }

        System.out.print(str);
    }
}
