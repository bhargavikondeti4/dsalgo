package sorting;

public class BubbleSort {


    public static void main(String[] args) {
        int[] arr = {8,3,17,4,14,2,1};
        sort(arr);
        for(int k:arr){
            System.out.print(k + " | ");
        }
    }

    private static void sort(int[] arr) {

        int n=arr.length;

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }

    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
