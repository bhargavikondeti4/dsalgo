package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationOfString {
    public static void main(String[] args) {
        String str = "geek";
        printP(str,0);
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        try {
            Integer.parseInt(br.readLine().trim());
        } catch (IOException e) {
            e.printStackTrace();
        }

       // Integer.parseInt();
    }

    private static String printP(String str, int n) {
        if(n==str.length()-1)return str;
        int t = n+1;
        for(int i=n;i<str.length();i++){
            char[] ch = str.toCharArray();
            swap(ch,n,i);
           // System.out.println("----"+String.valueOf(ch));
            String res = printP(String.valueOf(ch),t);
            if(res != null) System.out.println(res + " ");
        }
        return null;
    }

    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j]=temp;
    }
}
