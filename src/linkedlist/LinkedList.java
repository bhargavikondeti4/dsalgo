package linkedlist;

public class LinkedList {
    public static void main(String[] args) throws Exception {
        LinkedList list=new LinkedList();
        list.add1(10);
        list.add1(5);
        list.add1(2);
        list.add1(22);
        list.add1(1);
        System.out.println(list);
       // list.addAtPositionK(20,2);
      //  System.out.println(list);
       // list.reverseKElements(3);
       //  list.reverse();
        //list.reverseList();
        //System.out.println("reverse k elements is "+list);
       list.reverseEveryK(2);
        System.out.println(" reverse every k elements "+list);
    }

    public void reverseEveryK(int k) {
        this.head = reverseEveryKElements(this.head,k);
    }

    private Node head;
    private int size;

    public void add1(int data){
        addRec(this.head,data);
    }

    public void add(int data){
        Node curr = this.head;
        if(curr == null){
            this.head=new Node(data);
        }else{
            Node prev = this.head;
            while(curr!= null){
                prev =curr;
                curr=curr.next;
            }
            prev.next=new Node(data);
        }
        size++;
    }

    public void reverseList(){
        Node prev = null;
        Node current=this.head, after = this.head;
        while(after.next !=null){
            after = after.next;
            current.next=prev;
            prev = current;
            current = after;
        }
        after.next=prev;
        this.head=after;
    }

     void addRec(Node n,int data){
        if(n == null){
            this.head = new Node(data);
        }else{
            Node curr = n;
            if(curr.next == null){
                curr.next=new Node(data);
            }else{
                addRec(curr.next,data);
            }
        }

     }
    public void addAtPositionK(int data,int position) throws Exception {
        if(this.head == null){
            this.head= new Node(data);
        }
        if(position > size) throw new Exception("position is greater than actual size of the list");

        Node curr=this.head;
        Node prev=this.head;
        while(curr!= null && position > 1){
            prev=curr;
            curr=curr.next;
            position--;
        }
        if(position==1){
            Node newNode=new Node(data);
            newNode.next=curr;
            prev.next=newNode;
        }

        this.size++;
    }

    public void reverse(){
        Node curr = this.head;
        Node prev= null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        this.head = prev;
    }


    public void reverseKElements(int k){
        Node curr = this.head;
        Node prev = null;
        int count=0;
        while(curr != null && count < k){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
            count++;
        }
        if(count == k){
            this.head.next = curr;
        }
        this.head=prev;
    }

    public Node reverseEveryKElements(Node n,int k){
        Node temp = n;
        Node curr = n;
        Node prev=null;
        int count=0;
        while(curr != null && count < k){
            Node next=curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
            count++;
        }
        if(count==k){
            temp.next = reverseEveryKElements(curr,k);
        }
        return prev;
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        Node curr = this.head;
        while(curr != null){
            str.append(curr.data ).append(" | ");
            curr=curr.next;
        }
        return str.toString();
    }
}
