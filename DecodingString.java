public class DecodingString {
    public static void main(String[] args) {

       String inp = "101101110";
       char ch ;
       int count = 0;
       String res = "";
       for(int ind =0; ind < inp.length(); ind++){
        ch = inp.charAt(ind);
            if(ch == '1'){
                count++;
            }
            else{
                res += ((char)(count + 64));
                count = 0;

                
            }
       }

      System.out.print(res);
    }
}
