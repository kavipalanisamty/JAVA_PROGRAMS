public class AddingElement {

    public static void InsertAtBegin(int[] arr,int size, int new_element) 
    {
        for(int ind = size - 1; ind >= 0; ind--)
        {
            arr[ind+1] = arr[ind];
        }

        arr[0] = new_element;    
    }
    public static void main(String[] args) {
        
        int[] arr = {10,9,14,8,20,48,16,9,0};
        int size = arr.length;
        int new_element = 40;
        InsertAtBegin(arr,size,new_element);
        for(int ind = 0; ind <= size; ind++){
            System.out.println(arr[ind]);
        }
    }
}
