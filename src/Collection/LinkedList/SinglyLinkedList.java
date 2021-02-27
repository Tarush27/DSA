package Collection.LinkedList;

public class SinglyLinkedList {

    Node head;

    int size = 0;
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
    public Node reverseList(Node temp){
        Node cur = temp;
        Node prevNode = null, nextNode = null;
        while(cur != null){
            nextNode = cur.next;
            cur.next = prevNode;
            prevNode = cur;
            cur = nextNode;
        }
        return prevNode;
    }
    public void isPalindrome(){
        Node current = head;
        boolean flag = true;
        int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
        for(int i = 0;i<mid;i++){
            current = current.next;
        }
        Node revHead = reverseList(current.next);
        while(head != null && revHead != null){
            if(head.data != revHead.data){
                flag = false;
                break;
            }
        }
        head = head.next;
        revHead = revHead.next;
        if (flag){
            System.out.println("List is palindrome");
        }
        else{
            System.out.println("List is not a palindrome");
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
