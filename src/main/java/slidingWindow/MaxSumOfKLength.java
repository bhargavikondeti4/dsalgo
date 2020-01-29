package slidingWindow;

/**
 * Sliding window fixed length variant
 * https://www.geeksforgeeks.org/find-maximum-minimum-sum-subarray-size-k/
 *
 */
public class MaxSumOfKLength {


    public static void main(String[] args) {

        int[] a = {4,2,2,7,8,1,6,9};

        int k=3;

        System.out.println(findMaxSumOfKLength(a,k));

    }

    private static int findMaxSumOfKLength(int[] a, int k) {
        int max=Integer.MIN_VALUE;
        int currentSum=0;
        for(int i =0;i<a.length;i++){
            currentSum +=a[i];
            if(i >= k-1){
                max = Math.max(max,currentSum);
                currentSum -= a[i-(k-1)];
            }
        }
        return max;
    }
}
