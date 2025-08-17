public class RemovingExceptCharacters {
    public static void main(String[] args) {
        
        String str = "hi1111133435 babe!!! h@w are @you";
        int size = str.length();
        String newstr = "";
        char ch;
        for(int ind = 0; ind < size; ind++){
            ch = str.charAt(ind);
            if((ch >= 'a' && ch <='z')||(ch >= 'A' && ch <='Z')){
                newstr += ch;
            }            
        }

        System.out.println(newstr);
    }
}
