public class NearestInteger {
    public static int nearestIn(int num, int m){
        int lower_multi = (num/m) * m;
        int upper_multi = lower_multi + m;

        int Dis_lower = Math.abs(num - lower_multi);
        int Dis_upper = Math.abs(num - upper_multi);

        if(Dis_lower < Dis_upper)
            return lower_multi;
        else if(Dis_upper < Dis_lower)
            return upper_multi;
        else 
            return Math.max(lower_multi,upper_multi);
    }
    public static void main(String[] args) {
        int num = 26;
        int m = 3;
        System.out.print(nearestIn(num, m));
    }
}
