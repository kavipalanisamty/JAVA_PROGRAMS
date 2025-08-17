public class RevomingVowels {
    public static void main(String[] args) {
        
        String str = "Hi babe";
        String newstr = "";
        char ch;

        for(int ind = 0; ind < str.length(); ind++){
            ch = str.charAt(ind);
            if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' || ch == 'A' ||ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')){
                newstr += ch;
            }
        }

        System.out.println(newstr);
    }
}
