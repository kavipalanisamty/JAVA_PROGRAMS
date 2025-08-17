public class RhymingWords {
    public static String rhyming(String inp, String[] str, int size){
        String bestMatch = "No Word";
        int maxLength = 0; 
        for(String word : str){
            if(word.equals(inp)){
                continue;
            }
            int currentLength = 0;
            int minLength = Math.min(inp.length(), word.length());
            for(int ind = 0; ind <= minLength; ind++){
                if(inp.substring(inp.length()-ind).equals(word.substring(word.length()-ind))){
                    currentLength = ind;
                }
                else{
                    break;
                }
            }

            if(currentLength > maxLength){
                currentLength = maxLength;
                bestMatch = word;
            }
        }
        return bestMatch;
    }
    public static void main(String[] args) {
        String[] str = {"puzzle", "thunder", "powder", "blender", "under"};
        String inp = "thunder";
        int size = str.length;
        
        String res = rhyming(inp, str, size);
        System.out.println(res);
    }
}
