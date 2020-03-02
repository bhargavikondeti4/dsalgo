package tree;

import java.util.Stack;

public class LevelOrderTraversal {
    public static void main(String[] args) {

        Node root = new Node(3);
        root.left=new Node(9);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        traverse(root);
    }


    private static void traverse(Node root) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2= new Stack<>();




    }
}
