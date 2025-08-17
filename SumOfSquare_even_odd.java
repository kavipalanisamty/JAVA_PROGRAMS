public class SumOfSquare_even_odd {
    public static void main(String[] args) {
        int m = 1;
        int n = 10;
        int even = 0;
        int odd = 0;
        for(int ind = m; ind <=n; ind+=2){
            odd += (ind*ind);
        }
        for(int ind = m+1; ind <=n; ind+=2){
            even += (ind*ind);
        }

        System.out.println(Math.abs(odd - even));
    }
}
