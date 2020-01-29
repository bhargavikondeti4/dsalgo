package sorting;

import utility.Utility;

public class MergeSort {

    public static void mergeSort(int [] arr, int l, int r, int[] t){
        if(l<r){
            int m = l+(r-l)/2;
            mergeSort(arr, l, m, t);
            mergeSort(arr, m+1, r, t);
            merge(arr, l, m, r, t);
        }

    }

    private static void merge(int[] arr, int l, int m, int r, int[] t) {
        int k = l;
        int i = l, j = m+1;
        for(; i <= m && j <= r; ){
            if(arr[i] < arr[j]){
                t[k] = arr[i];
                i++;
            }
            else{
                t[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= m){
            t[k] = arr[i];i++;k++;
        }
        while (j<=r){
            t[k] = arr[j]; j++; k++;
        }
        for(int x = l; x<=r; x++){
            arr[x] = t[x];
        }
    }

    public static void main(String[] args) {
        int[] arr = {34,22,31,12,3,7,4,2,28};
        int[] t = new int[arr.length];
        mergeSort(arr, 0, arr.length-1, t);
        Utility.print(arr,"Merge sort");

    }
}
