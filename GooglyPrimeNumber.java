public class GooglyPrimeNumber {

    public static boolean isPrime(int sum){
        if(sum <= 1) return false;
        if(sum == 2 || sum == 3) return true;
        for(int ind = 2; ind <= sum/2; ind++){
            if(sum % ind == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int num = 44;
        int sum = 0;
        while(num != 0){
            sum += num%10;
            num/=10;
        }

        if(isPrime(sum)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
