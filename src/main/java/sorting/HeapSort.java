package sorting;

import utility.Utility;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {8,4,14,2,3,7,1,6};

        hSort(arr);
        Utility.print(arr," heap sort is");
    }

    private static void hSort(int[] arr) {
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            Utility.swap(arr,0,i);
            heapify(arr,0,i);
        }
    }

    private static void heapify(int[] arr, int i, int n) {

        if(i > n)return;
        int l=2*i+1;
        int r= 2*i+2;

        int root=i;
        int min=root;

        if(l< n &&arr[l] < arr[min])min=l;
        if(arr[r] < arr[min])min=r;

        if(root!= min){
            Utility.swap(arr,root,min);
            heapify(arr,min,n);
        }

    }
}
