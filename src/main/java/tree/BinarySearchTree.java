package tree;

public class BinarySearchTree {

    /*class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
*/

    Node root;
    public void add(int data){
        this.root = add(this.root,data);
    }

    private Node add(Node root,int data){
        Node node = new Node(data);
        if(root == null){
            return node;
        }


        if(data < root.data){
            root.left = add(root.left,data);
        }else{
            root.right = add(root.right,data);
        }
        return root;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(50);
        tree.add(40);
        tree.add(60);
        tree.add(45);
        tree.add(30);
        System.out.println(tree);
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
