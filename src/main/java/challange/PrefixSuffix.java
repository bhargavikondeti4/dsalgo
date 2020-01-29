package challange;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class PrefixSuffix {

    public static void main(String[] args) {
        int[] arr = {5,3,5,10,7,10};

        findPossibilities(arr);
    }

    private static void findPossibilities(int[] arr) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i =0;i<arr.length;i++){
            Integer v = map.get(arr[i]);
            if(v == null){
                map.put(Integer.valueOf(arr[i]),1);

            }else{
                v=v+1;
                map.put(Integer.valueOf(arr[i]),v);
            }
        }
        int r = arr.length;
        boolean found=false;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                int sum = arr[i]+arr[j];
                if(!found && sum > map.lastKey()){
                    r = j;
                    found=true;
                }
               // if()
            }
        }
    }
}
