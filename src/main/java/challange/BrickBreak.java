package challange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class BrickBreak {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            String str = br.readLine().trim();
            int[] a = Stream.of(str.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            int hits = findHits(a);
            System.out.println(hits);
        }
    }

    private static int findHits(int[] a) {
        int s = a[0];
        int sum=0;
        int hitCount=0;
        for(int i=1;i<a.length;i++){
            sum = sum + a[i];
            if(sum > s) {
                hitCount++;
                sum = a[i];
            }

        }
        return hitCount+1;
    }
}
