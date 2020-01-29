package Arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/
 *
 */
public class SumOfTwoNumbers {

    /*
     * sort array
     * take two pointers one at beginning and one from end iterate till both meets
     * if a[i]+a[j] == k return true;
     * if a[i] +a[j] > sum decrement j else increment i
     */
    private static boolean findKSumPairExists(int[] a, int k) {
        Arrays.sort(a);
        int i=0,j=a.length-1;
        while(i<j){
            if(a[i]+a[j] == k)return true;
            if(a[i]+a[j] > k) j--;
            else i++;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {6,2,7,1,8,3,10};
        int k= 10;

        //System.out.println(findKSumPairExists(a,k));

        findIndexIfSumPairExists(a,k);
    }

    /*  Using hashmap to keep track of indexes
     */
    private static void findIndexIfSumPairExists(int[] a, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<a.length;i++){
            int remaining = k-a[i];
            if(hm.containsKey(remaining)){
                System.out.println(" sum pair exists at index "+hm.get(remaining) + " " + i);
            }else{
                hm.put(a[i],i);
            }
        }

    }


}
