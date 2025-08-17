import java.util.HashMap;
import java.util.Map;

public class CountingFrequency {
    public static void main(String[] args) {
        
        int n = 6;
        int arr[] = {10,5,10,15,10,5};

        Map<Integer, Integer> mp = new HashMap<>();

        for(int ind = 0; ind < n; ind++){
            if(mp.containsKey(arr[ind])){
                mp.put(arr[ind], mp.get(arr[ind])+1);
            }
            else{
                mp.put(arr[ind],1);
            }
        }

        for(Map.Entry<Integer, Integer> mpp : mp.entrySet() ){
            System.out.println(mpp.getKey() + " " + mpp.getValue());
        }
    }
}
