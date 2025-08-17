public class ReverseString {
    public static void main(String[] args) {
        
        String str = "kavee";
        String newStr = "";
        char ch;
        for(int ind = str.length()-1; ind >= 0; ind--){
            ch = str.charAt(ind);
            newStr += ch;
        }

        System.out.println(newStr);
    }
}
