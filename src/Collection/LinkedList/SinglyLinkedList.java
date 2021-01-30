package Collection.LinkedList;

public class SinglyLinkedList {

    Node head;

    public void deleteStart(){
        Node n1 = head;
        if (isEmpty()){
            head = n1;
            return;
        }
        head = head.next;
    }

    public void deleteEnd(){
        if(isEmpty()){
            return;
        }
        Node n2 = head;
        while (n2.next.next != null){
            n2 = n2.next;
        }
        n2.next = null;
    }

    public void deleteAtPos(int pos){
        if(head == null){
            return;
        }
        else{
            Node n3 = head;
            Node t = null;
            for(int i = 0;i <= pos - 1;i++){
                t=n3;
                n3 = n3.next;
            }
            t.next = n3.next;
        }

    }
    public void insertStart(int v){
        Node n = new Node(v);
        n.next = head;
        head = n;
    }
    public void insertEnd(int v){
        Node n = new Node(v);
        Node t = head;
        if(isEmpty()){
            head = n;
            return;
        }
        while(t.next != null){
            t = t.next;
        }
        t.next = n;
    }
    public void insertAtPos(Node head, int v){
        if(head == null){
            System.out.println("cannot be null");
            return;
        }
        Node n = new Node(v);
        n.next = head.next;
        head.next = n;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void print(){
        Node t = head;
        while(t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
}