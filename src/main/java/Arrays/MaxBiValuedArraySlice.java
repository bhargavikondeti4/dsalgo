package Arrays;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class MaxBiValuedArraySlice {
   // public static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int[] a = {0,5,4,4,5,12,6,7,6,7,6,7};

       int result= solve(a);
        System.out.println(result);
    }

    private static int solve(int[] a) {
        int max = Integer.MIN_VALUE;
        HashMap<Long,Long> map = new HashMap<>();
        Deque<Long> dq = new LinkedList<>();

        for(int i=0;i<a.length;i++){

            if(map.containsKey(Long.valueOf(a[i]))){
                Long v = map.get(Long.valueOf(a[i]));
                map.put(Long.valueOf(a[i]),v+1);
            }else{

                if(map.size() < 2){
                    map.put(Long.valueOf(a[i]),Long.valueOf(1));
                }else{

                    max = max < dq.size() ? dq.size():max;
                    while(!dq.isEmpty()){
                        Long x = dq.peek();
                        Long y = map.get(x);
                        Long newV = y-1;
                        map.put(x,newV);
                        dq.poll();
                        if(newV ==0){
                            map.remove(x);
                            map.put(Long.valueOf(a[i]),Long.valueOf(1));
                            break;

                        }
                    }

                }

            }
            dq.addLast(Long.valueOf(a[i]));
        }

        max =max < dq.size()? dq.size():max;

        return max;

    }
}
