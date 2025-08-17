public class SwapCharacters {
    public static void main(String[] args) {
        String str = "apples";
        char ch1 = 'a';
        char ch2 = 'p' ;
        char temp = '#';

        str = str.replace(ch1, temp );
        str = str.replace(ch2, ch1);
        str = str.replace(temp,ch2);

        System.out.println(str);
    }
}
