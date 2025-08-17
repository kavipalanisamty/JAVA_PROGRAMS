public class Buzz {
 public static void main(String[] args) {
    int n = 147;

    if ((n/7==0) || (n%10 == 7))
        System.out.println( n + " is a Buzz Number");
    else
        System.out.println( n + " is not a Buzz Number");
 }   
}
