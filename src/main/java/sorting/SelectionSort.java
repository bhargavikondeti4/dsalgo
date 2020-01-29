package sorting;

import utility.Utility;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8,4,14,2,7,3,1};
        sSort(arr);
        for(int k:arr) System.out.print(k+" | ");
    }

    private static void sSort(int[] arr) {

        int n = arr.length;

        for(int i=0;i<n;i++){
            int minDindex  =i;
            for(int j=i+1;j<n;j++){
                if(arr[j] <arr[minDindex]){
                    minDindex=j;
                }
            }
            if(minDindex != i) Utility.swap(arr,i,minDindex);
        }
    }


}
