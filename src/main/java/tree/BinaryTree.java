package tree;

import java.util.Stack;

public class BinaryTree {

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left=new Node(20);
        root.right=new Node(5);
        root.left.left=new Node(2);
        root.left.right=new Node(3);
        root.right.left=new Node(6);

        inOrderIterative(root);
       // System.out.println(root);
    }

    private static void inOrder(Node root) {
        if(root==null)return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    private  static void inOrderIterative(Node root){
        if(root == null) return;
        Stack<Node> stack = new Stack();
        Node curr = root;
        while(curr != null || !stack.isEmpty()){

              while(curr != null){
                  stack.push(curr);
                  curr = curr.left;
              }

              curr = stack.pop();
              System.out.println(curr.data);
              curr = curr.right;
        }
    }
}
