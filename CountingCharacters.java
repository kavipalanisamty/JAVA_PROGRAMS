import java.util.Scanner;

class CountingCharacter{
    public static void main(String[] args) {
        Scanner sac = new Scanner(System.in);
        String str = sac.nextLine();
        char ch = sac.next().charAt(0);
        int str_len = sac.nextInt();
        int count = 0;
        char charInd;
        for(int ind = 0; ind < str_len; ind++){
            charInd = str.charAt(ind);
            if(charInd == ch ){
                count++;
            }
        }

        System.out.print(count);
    }
}