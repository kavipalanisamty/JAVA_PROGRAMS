import java.util.HashMap;

public class LargestSubarrayEqual0s1s {
    public static int maxLengthEqual0s1s(int[] arr) {
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int maxLength = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += (arr[i] == 0) ? -1 : 1;
            if (cumulativeSum == 0) {
                maxLength = i + 1;
            }
            if (sumIndexMap.containsKey(cumulativeSum)) {
                int subarrayLength = i - sumIndexMap.get(cumulativeSum);
                maxLength = Math.max(maxLength, subarrayLength);
            } else {
                sumIndexMap.put(cumulativeSum, i);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 0, 1, 1, 1, 0, 0};
        int outputLength = maxLengthEqual0s1s(inputArray);
        System.out.println(outputLength); // Output: 6
    }
}
