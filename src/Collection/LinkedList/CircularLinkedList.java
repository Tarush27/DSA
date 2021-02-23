package Collection.LinkedList;

public class CircularLinkedList {

    Node head = null;
    Node tail = null;

    public void addMid(Node head, int v){
        if(head == null){
            System.out.println("list cannot be empty");
        }

        Node n = new Node(v);
        n.next = head.next;
        head.next = n;
    }
    public void deleteStart(){
        if(head == null){
            return;
        }
        head = head.next;
        tail.next = head;
    }
    public void deleteEnd(){
        if(tail == null){
            return;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = tail.next;
        tail = temp;
    }
    public void deleteMid(){
        Node current, temp;
        //Checks whether list is empty    
        int size = 0;
        if(head == null) {
            return;
        }
        else {
            //Store the mid position of the list    
            int count = (size % 2 == 0) ? (size/2) : ((size+1)/2);
            //Checks whether head is equal to tail or not, if yes then list has only one node.    
            if( head != tail ) {
                //Initially temp will point to head;    
                temp = head;
                current = null;
                //Current will point to node previous to temp    
                //If temp is pointing to node 2 then current will points to node 1.    
                for(int i = 0; i < count-1; i++){
                    current = temp;
                    temp = temp.next;
                }

                if(current != null) {
                    //temp is the middle that needs to be removed.    
                    //So, current node will point to node next to temp by skipping temp.    
                    current.next = temp.next;
                    //Delete temp;    
                    temp = null;
                }
                //Current points to null then head and tail will point to node next to temp.    
                else {
                    head = tail = temp.next;
                    tail.next = head;
                    //Delete temp;    
                    temp = null;
                }

            }
            //If the list contains only one element     
            //then it will remove it and both head and tail will point to null    
            else {
                head = tail = null;
            }
        }
        size--;

    }
    public void addStart(int v){
        Node n = new Node(v);
        if(head == null){
            head = tail = n;
            n.next = head;
        }
        else{
            Node temp = head;
            n.next = temp;
            head = n;
            tail.next = head;
        }
    }
    public void addEnd(int v){
        Node n = new Node(v);
        if(head == null){
            head = tail = n;
            n.next = head;
        }
        else{
            tail.next = n;
            tail = n;
            tail.next = head;
        }
    }
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    public void show(){
        Node cur = head;
        do{
            System.out.print(head.data + " ");
            head = head.next;
        }while(cur != head);
        System.out.println();
    }
}
