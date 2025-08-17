public class NonRepeatingChar {
    public static void main(String[] args) {
        
        String str = "take you forward";

        int[] freq = new int[26];

        for(int ind = 0; ind < str.length(); ind++){
            freq[str.charAt(ind) - 'a']++;
        }

        for(int index = 0; index < 26; index++){
            if(freq[index]==0){
                System.out.println((char)(index+'a'));
            }
        }
        
    }
}
