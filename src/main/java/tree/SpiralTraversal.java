package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class SpiralTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        traverse(root);
        System.out.println("done");
    }


    private static void traverse(Node root) {
        LinkedList<List<Node>> queue = new LinkedList<>();
        List<Node> list = new ArrayList<>();
        list.add(root);
        queue.add(list);
        boolean is=false;

        while(!queue.isEmpty()){
            List<Node> nodes = queue.poll();
            List<Node> lis = new ArrayList<>();

            for(Node n :nodes){
                if(n.left != null ) lis.add(n.left);
                if(n.right != null) lis.add(n.right);
            }
            if(lis.size()> 0)queue.add(lis);

            if(!is){
                //print in reverse
                for(int i=nodes.size()-1;i>=0;i--){
                    System.out.print(nodes.get(i).data + " ");
                }
            }else{
                for(int i=0;i<nodes.size();i++){
                    System.out.print(nodes.get(i).data + " ");
                }
            }
            System.out.println();
            is=!is;

        }

    }
}
