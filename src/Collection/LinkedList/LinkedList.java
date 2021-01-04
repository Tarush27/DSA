package Collection.LinkedList;

class MyLinkedList {
//     Node head;
//     int size;

//    public void insertBeg(int v){
//        Node n;
//        n = new Node();
//        n.setData(v);
//        n.setNext(head);
//        head = n;
//        size++;
//    }
    public boolean isEmpty(){
        return head == null;
    }

    public int getListSize(){
        return size;
    }

    public void print(){
        Node temp = head;
        if(isEmpty()){
            head = temp;
            return;
        }
        int i = 0;
        while(i <= size){
            System.out.print(temp.getData() + "" + (i++));
            temp = temp.getNext();
        }
    }
}
class Node{
     int data;
     Node next;

    public Node(){
        data=0;
        next = null;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public void setData(int data){
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Node getNext(){
        return next;
    }
}

public class LinkedList{
    public static void main(String[] args){


    }
}
