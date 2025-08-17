public class SubStringUsingLibrary {
    
    public static void main(String[] args) {
        String str1 = "take forw ard";
        String str2 = "forward";
        
        int found_index = str1.indexOf(str2);

        System.out.println(found_index);
    }
}
