public class CoutingVCS {
    public static void main(String[] args) {
        String str = "Hi babe";
        int size = str.length();
        char ch;
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        for(int ind = 0; ind < size; ind++){
            ch = str.charAt(ind);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' || ch == 'A' ||ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                    vowels++;
            }
            else if(ch == ' '){
                spaces++;
            }
            else 
                consonants++;

            
        }

        System.out.println("vowels : " + vowels);
        System.out.println("consonants : " + consonants);
        System.out.println("spaces : " + spaces);


    }
}
