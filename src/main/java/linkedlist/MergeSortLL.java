package linkedlist;

public class MergeSortLL {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add1(10);
        list.add1(5);
        list.add1(2);
        list.add1(22);
        list.add1(1);
        list.add1(9);
        System.out.println(list);
        Node head = list.getHead();
        Node sortedList = ms(head);
        System.out.println(sortedList);
    }

    private static Node ms(Node node) {
        if(node == null || node.next == null) return node;
        //Find mid
        Node slow=node,fast=slow.next;
        while(fast != null && fast.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }

        Node a = node;
        Node b = slow.next;
        slow.next=null;

       Node left = ms(a);
       Node right = ms(b);
       Node sortedList = merge(left,right);
        return sortedList;
    }

    private static Node merge(Node a, Node b) {
        Node node1 = a;
        Node node2= b;
        Node temp = new Node(0);
        Node dummy=temp;
        while(node1 != null && node2 != null){

            if(node1.data > node2.data){
                dummy.next=node2;
                node2=node2.next;
            }else{
                dummy.next=node1;
                node1=node1.next;
            }
            dummy = dummy.next;
        }
        if(node1 == null){
           dummy.next=node2;
        }
        if(node2 == null){
            dummy.next=node1;
        }
        return temp.next;
    }
}
