package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        TreeMap<Integer, List<Node>> map = new TreeMap();
        traverse(root,0,map);

        for(List<Node> list :map.values()){
            for(Node n : list){
                System.out.print(n.data + " ");
            }
            System.out.println();
        }
    }

    private static void traverse(Node root, int dist, TreeMap<Integer, List<Node>> map) {
         if(root == null)return;

         List<Node> list = map.get(dist);
         if(list == null){
             list = new ArrayList<Node>();
         }
         list.add(root);
         map.put(dist,list);

         traverse(root.left,dist-1,map);
         traverse(root.right,dist+1,map);

    }


}
