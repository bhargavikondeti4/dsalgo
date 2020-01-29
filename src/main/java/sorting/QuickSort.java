package sorting;

import utility.Utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,3,2,1,10,9,40,22,50,33,11,5,8,4,6,20};
        Utility.print(arr,"Un-sorted array : ");
        qSort(arr,0,arr.length-1);
      //  qs(arr,0,arr.length);
        Utility.print(arr,"Sorted array is ");
    }

    private static void qSort(int[] arr, int l, int r) {
        if(l >= r) return;
        int p=l;
        int i=p;
        for(int j=i+1;j<=r;j++){
            if(arr[j] < arr[p]){
                i++;
                Utility.swap(arr,i,j);
            }
        }
        if(i != p) Utility.swap(arr,i,p);
        qSort(arr,l,i-1);
        qSort(arr,i+1,r);
    }

}
