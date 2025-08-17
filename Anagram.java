class Anagram {
    public static boolean IsAnagram(String t,int t_size,String s,int s_size){
        char t_arr[] = t.toLowerCase().toCharArray();
        char ṇs_arr[] = s.toLowerCase().toCharArray();
        int[] freq = new int[26];
        int ind;
        for(ind = 0; ind < t_size; ind++){
            freq[t_arr[ind] - 'a']++;
            freq[s_arr[ind] - 'a']--;
        }

        for(ind = 0; ind < 26; ind++){
            if(freq[ind]!=0)
                return false;
        }

        return true;

    }
    public static void main(String[] args) {
        String t = "ansgram";
        int t_size = t.length();
        String s = "nagaram";
        int s_size = s.length();

        if(t_size != s_size){
            System.out.println("False");
        }

        System.out.println(IsAnagram(t,t_size,s,s_size) ? "true" : "false");
        
    }
}
