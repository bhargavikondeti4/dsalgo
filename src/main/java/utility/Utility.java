package utility;

public class Utility {

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void print(int[] arr,String msg){
        System.out.println(msg);
        for(int i :arr){
            System.out.print(i+" | ");
        }
        System.out.println("\n");
    }
}
