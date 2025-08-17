public class OccurrencesofGivenElement {

    public static void main(String[] args) {
        int[] arr ={5,2,4,1,2};
        int target_element = 2;
        int count = 0;
        for(int ind = 0; ind < arr.length; ind++){
            if(target_element == arr[ind])
                count++;
        }

        System.out.println(count);

    }
}