import java.util.HashMap;
import java.util.Map;

public class RemovingDuplicatesUnsortedArray {
    public static void main(String[] args) {
        
        int arr[] = {4,3,9,2,4,1,10,89,34};
        int size = arr.length;

        Map<Integer, Integer> mp = new HashMap<>();

        for(int ind = 0; ind < size; ind++){
            if(!mp.containsKey(arr[ind])){
                System.out.print(arr[ind] + " ");
                mp.put(arr[ind],1);
            }
        }
    }
}
