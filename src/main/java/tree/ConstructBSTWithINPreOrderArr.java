package tree;

public class ConstructBSTWithINPreOrderArr {
    public static int j =0;
    public static void main(String[] args) {
        int[] in ={1,3,4,5,6,7,8,9,10};
        int[] pre ={6,3,1,5,4,8,7,10,9};

        Node root = constructBST(in ,pre,0,in.length-1);
        System.out.println(root);

    }

    private static Node constructBST(int[] in, int[] pre,int l,int r) {

        if(l>r)return null;

        Node root = new Node(pre[j]);
        int i = searchInIn(in,pre[j],l,r);
        j++;
        root.left = constructBST(in,pre,l,i-1);
        root.right=constructBST(in,pre,i+1,r);

        return root;
    }

    private static int searchInIn(int[] in, int e,int l,int r) {

        for(int k=l;k<=r;k++){
            if(in[k] == e){
                return k;
            }
        }
        return -1;
    }

}
