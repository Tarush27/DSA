package Collection.LinkedList;

public class DoublyLinkedList {

    Node head;
    public boolean isEmpty(){
        return head == null;
    }
    public void deleteStart(){
        if (head == null){
            return;
        }
        head = head.next;
        head.prev = null;

    }
    public void deleteEnd(){
        if(head == null){
            return;
        }
        Node node = head;
        while(node.next.next != null){
            node = node.next;
        }
        node.next = null;
    }
    public void deletePos(int pos){
        if (head == null){
            return;
        }
        else{
            Node n = head;
            Node t = null;
            for(int i = 1;i<=pos-1;i++){
                t = n;
                n = n.next;
            }
            t.next = n.next;
            n.next.prev = t;
        }
    }
    public void insertStart(int v){
        Node n = new Node(v);
        n.prev = null;
        n.next = head;
        if(head != null){
            head.prev = n;
        }
        head = n;
    }

    public void insertMiddle(Node head,int v){
           if(head == null){
               return;
           }

           Node n1 = new Node(v);
           n1.next = head.next;
           head.next = n1;
           n1.prev = head;
           if(n1.next != null){
               n1.next.prev = n1;
           }
    }

    public void insertEnd(int v){
        Node n2 = new Node(v);
        Node last = head;
        n2.next = null;
        if(head == null){
            head = n2;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = n2;
        n2.prev = last;
    }

    public int countNodes(){
        int c = 0;
        Node current = head;
        while(current.next != null){
            c++;
            current = current.next;
        }
        return c;
    }

    public void printList(Node head){
        Node last = null;
        System.out.println("Traversal in forward direction : ");
        while(head != null){
            System.out.print(head.data + " ");
            last = head;
            head = head.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction : ");
        while(last != null){
            System.out.print(last.data + " ");
            last = last.prev;
        }
    }
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
}
