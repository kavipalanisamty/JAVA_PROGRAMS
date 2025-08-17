public class Armstrong {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int last_digit = 0;
        int arm_strong = 0;
        while(temp != 0){
            last_digit = temp % 10;
            arm_strong += last_digit * last_digit * last_digit;
            temp /= 10;
        }

        if( num == arm_strong){
            System.out.println( "THE GIVEN NUMBER " + num +" IS ARMSTRONG NUMBER");
        }

        else {
            System.out.println( "THE GIVEN NUMBER " + num +" IS NOT ARMSTRONG NUMBER");
        }
    }
}
