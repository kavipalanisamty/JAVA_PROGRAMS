public class StringConversionBasedonCount {
    public static void main(String[] args) {
        String str = "abCdEfg";
        int lower = 0;
        int upper = 0; 
        char ch;

        for(int ind = 0; ind < str.length(); ind++){
            ch = str.charAt(ind);
            if(ch >= 'A' && ch <= 'Z'){
                upper++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                lower++;
            }
        }

        if(lower > upper){
            System.out.println(str.toLowerCase());
        }
        else if(upper > lower){
            System.out.println(str.toUpperCase());
        }
    }
}
