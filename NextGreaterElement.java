public class NextGreaterElement{
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,25};
        int size = arr.length;
        int max = 0;
        for(int ind = 0; ind < size; ind++){
            max = -1;
            for(int ind1 = ind + 1; ind1 < size; ind1++){
                if(arr[ind] < arr[ind1]){
                    max = arr[ind1];
                    break;
                }
            }
         
            System.out.print(max+" ");
        }
    }
}