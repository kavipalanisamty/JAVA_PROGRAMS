public class Palindrome {
    public static boolean IsPalindrome(String s){
        int ind = 0;
        int s_size = s.length();
        System.out.println(s_size/2);
        while( ind <= s_size/2){
            if(s.charAt(ind)!=s.charAt(s_size - 1)){
                return false;
            }
            ind++;
            s_size--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "mam";
        if(IsPalindrome(str)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        
    }
}
