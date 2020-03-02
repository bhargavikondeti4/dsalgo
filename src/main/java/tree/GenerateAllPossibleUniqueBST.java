package tree;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllPossibleUniqueBST {

    public static void main(String[] args) {
        int n=5;
        List<Node> bsts = findPosiibleBST(1,n);
        System.out.println(bstCount(n));
    }

    private static List<Node> findPosiibleBST(int s, int e) {
        ArrayList<Node> list = new ArrayList<>();
        if(s> e){
            list.add(null);
            return list;
        }

        for(int i=s;i<=e;i++){
            List<Node> lefts = findPosiibleBST(s,i-1);
            List<Node> rights = findPosiibleBST(i+1,e);

            for(Node left : lefts){
                for(Node right : rights){
                    Node root = new Node(i);
                    root.left=left;
                    root.right=right;
                    list.add(root);
                }
            }
        }
        return list;
    }



    private static int bstCount(int n){

        int[] g = new int[n+1];

        g[0]=g[1] = 1;

        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){

                g[i] = g[i] + g[j-1]*g[i-j];
            }
        }
        return g[n];
    }
}
