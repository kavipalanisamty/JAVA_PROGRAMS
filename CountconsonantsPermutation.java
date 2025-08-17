public class CountconsonantsPermutation{
    public static int factorial(int num){
        if(num == 0)
            return 1;
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        String str = "ABCDE";
        int n = str.length();
        char ch;
        int count = 0;
        for(int ind = 0; ind < n; ind++){
            ch = str.charAt(ind);
            if(ch == 'a' ||ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U')
                continue;
            else
                count++;
                
        }
        System.out.println(factorial(count));
    }
}