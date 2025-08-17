public class PalindromeString {
    public static void main(String[] args) {
        
        String str = "MADAM";
        String temp = "";
        for(int ind = str.length()-1; ind >=0 ; ind--){
             temp += str.charAt(ind);
        }
        System.out.println(temp);
        if(temp.equals(str))
            System.out.println("Palindrome");
        else    
            System.out.println("Not an Palindrome");
    }
}
