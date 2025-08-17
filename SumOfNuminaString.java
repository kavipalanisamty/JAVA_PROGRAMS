public class SumOfNuminaString {
    public static void main(String[] args) {
        
        String str = "k1a2v3e4e5";
        char ch;
        int sum = 0;
        
        for(int ind = 0; ind < str.length(); ind++){
            ch = str.charAt(ind);
            if(ch >= '0' && ch <= '9'){
                sum += (ch - '0');
            }
        }
        System.out.println(sum);

    }
}
