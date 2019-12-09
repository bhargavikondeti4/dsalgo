package sorting;

import utility.Utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,3,2,1,10,9,40,22,50,33,11,5,8,4,6,20};
        Utility.print(arr,"Un-sorted array : ");
        qs(arr,0,arr.length);
        Utility.print(arr,"Sorted array is ");
    }

    private static void qs(int[] arr,int s,int e) {
        if(s>e || arr == null) return;
        int pivot = s;
        int j=pivot;
        for(int i=s;i<e;i++){
            if(arr[i] < arr[pivot]){
               j++;
               Utility.swap(arr,i,j);
            }
        }
        if(j!= pivot){
            Utility.swap(arr,j,pivot);
        }

        if(j<e)qs(arr,s,j);
        if(j>=s)qs(arr,j+1,e);

    }
}
