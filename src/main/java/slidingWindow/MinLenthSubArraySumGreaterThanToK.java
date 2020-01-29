package slidingWindow;

/**
 * Dynamic variant
 * https://www.geeksforgeeks.org/minimum-length-subarray-sum-greater-given-value/
 *
 */
public class MinLenthSubArraySumGreaterThanToK {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4};
        int k = 8;

        int res = findMinLengthSubArray(arr,k);

        System.out.println(res == Integer.MAX_VALUE ? "Not Possible" : res);
    }

    private static int findMinLengthSubArray(int[] arr, int k) {
        int min = Integer.MAX_VALUE;
        int currentSum =0;
        int windowStart=0;

        for(int i=0;i<arr.length;i++){
            currentSum +=arr[i];

            while(currentSum > k){
                min = Math.min(min,i-windowStart+1);
                if(min == 1) return 1;
                currentSum -= arr[windowStart];
                windowStart++;
            }
        }
        return min;

    }


}
