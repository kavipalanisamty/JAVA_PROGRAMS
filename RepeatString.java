public class RepeatString {
    public static void main(String[] args) {
    int inp1 = 3;
    String inp2 = "abc";
    String out ="";
    int ind =0;
    while(ind < inp1){
        out += inp2;
        ind++;
    }

    System.out.print(out);
}
}
