package slidingWindow;

import java.util.HashMap;

/**
 * https://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/
 */
public class LongestSubStringWithKUniqueCharacters {
    public static void main(String[] args) {
        String str = "aabbcc";//"AAHHIBC";
        int k=1;

        System.out.println(findLongestSubstringWithKUniqueLetters(str,k));
    }

    private static int findLongestSubstringWithKUniqueLetters(String str, int k) {
        int max = Integer.MIN_VALUE;
        HashMap<Character,Integer> hm = new HashMap<>();
        int windowStart =0;

        for(int i =0;i<str.length();i++){
            Character x = str.charAt(i);
            if(hm.get(x) != null){
                int v= hm.get(x)+1;
                hm.put(x,v);
            }else{

                if(hm.keySet().size()==k){
                    int count=0;
                    for(int v :hm.values()){
                        count=count+v;
                    }
                    max = Math.max(max,count);
                }

                hm.put(x,1);
            }


            while(hm.keySet().size() > k){
                Character y = str.charAt(windowStart);
                int v =hm.get(y)-1;
                hm.put(y,v);
                if(hm.get(y) == 0) hm.remove(y);
                windowStart++;
            }

        }
        return  max;
    }
}
