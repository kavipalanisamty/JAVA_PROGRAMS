public class Fibonacci {
    public static void main(String[] args) {
        
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        int size = 10;
        System.out.print(num1 +" "+ num2+" ");
        for(int ind = 2; ind <= size; ind++){
             sum = num1 + num2;
             System.out.print(sum+" ");
             num1 = num2;
             num2 = sum;
        }

        System.out.println(sum);
    }
}
