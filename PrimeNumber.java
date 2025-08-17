public class PrimeNumber {

    public static boolean IsPrime(int num){
        if(num <= 1)
            return false;
        if(num == 2 || num == 3)
            return true;

        for(int ind = 2; ind <= Math.sqrt(num); ind++){
            if( num % ind == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        int num = 18;

        if(IsPrime(num)){
            System.out.println("The Given Number is a Prime Number");
        }
        else{
            System.out.println("The Given Number is Not a Prime Number");

        }
    }
}
