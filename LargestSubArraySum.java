public class LargestSubArraySum {
    public static void main(String[] args) {
        int[]  Nums= {-2,1,-3,4,-1,2,1,-5,4};
        int size = Nums.length;

        int maxSoFar = Nums[0];
        int currentMax = Nums[0];
        for(int ind = 1; ind < size; ind++){
            currentMax = Math.max(Nums[ind], currentMax + Nums[ind]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        System.out.println(maxSoFar);
    }
}
