package tree;


import java.util.LinkedList;

public class ValidateBinarySearchTree {
    public static void main(String[] args) {

        Node root = new Node(4);
        root.left=new Node(2);
        root.right=new Node(5);
        root.left.left=new Node(1);
        root.left.right=new Node(3);

        //root.right.left=new Node(30);
        //root.right.right=new Node(100);
        System.out.println(validateBST(root));

    }

    /*
    find inorder then if next node key is less than previous node key return false
     */
    private static boolean validateBST(Node root) {

        Node curr = root;
        Node prev = null;
        LinkedList<Node> stack = new LinkedList<Node>();

        while(curr != null || !stack.isEmpty()){

            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            System.out.println(curr.data);
            if(prev!= null && prev.data > curr.data){
                return false;
            }
            prev = curr;
            curr=curr.right;

        }

        return true;
    }
}
