import java.util.Scanner;

public class CaptializeFirstnLast {

    public static String CaptializeFirstnLastWord(String str, int size){

        StringBuffer sb = new StringBuffer(str);

        for(int ind = 0; ind < size; ind++){
            if(ind == 0 || ind == (size -1)){
                sb.setCharAt(ind, Character.toUpperCase(str.charAt(ind)));
            }
            else if(str.charAt(ind) == ' '){
                sb.setCharAt(ind-1, Character.toUpperCase(str.charAt(ind-1)));
                sb.setCharAt(ind+1, Character.toUpperCase(str.charAt(ind+1)));
            }
        }
            return sb.toString();

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int size = input.length();

        System.out.println(CaptializeFirstnLastWord(input, size));
        sc.close();
        
    }
}
