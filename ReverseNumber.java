public class ReverseNumber {
    public static void main(String[] args) {
        int num = 456789;
        int temp = num;
        int last_digit;
        int rev_num = 0;
        while(temp != 0){
            last_digit = temp % 10;
            rev_num = rev_num * 10 + last_digit;
            temp /= 10;
        }

        System.out.println(rev_num);
    }
}
