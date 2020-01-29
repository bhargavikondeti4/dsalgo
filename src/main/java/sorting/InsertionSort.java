package sorting;

import utility.Utility;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        iSort(arr);
        Utility.print(arr,"arr is");
    }

    private static void iSort(int[] arr) {
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    Utility.swap(arr,j,j-1);
                }
            }
        }
    }
}
