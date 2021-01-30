package Collection.LinkedList;

class MyLinkedList {
     private Node head;
     private int size;

    public void insertBeg(int v){
        Node n;
        n = new Node();
        n.setData(v);
        n.setNext(head);
        head = n;
        size++;
    }

    public void insertEnd(int v){
        Node n,t = head;
        n = new Node();
        n.setData(v);
        if (isEmpty()){
            head = n;
            return;
        }
        while(t != null){
            t=t.getNext();
        }
        t.setNext(n);
        size++;
    }

    public void insertPos(int v,int index){
        if(index == 1)
            insertBeg(v);
        else if (index == size+1)
            insertEnd(v);
        else if (index > 1 && index <= size){
            Node n = new Node(v,null);
            Node t = head;
            for (int i = 1;i<index-1;i++)
                t = t.getNext();
            n.setNext(t.getNext());
            t.setNext(n);
            size++;
        }
        else{
            System.out.println("Insertion not possible : " + index);
        }

    }
    public boolean isEmpty(){
        return head == null;
    }

    public int getListSize(){
        return size;
    }

    public void print(){
        Node temp = head;
        int i = 0;
        while(i <= size){
            System.out.print(temp.getData() + "" + (i++));
            temp = temp.getNext();
        }
    }
}
class Node{
    private int data;
    private Node next;

    public Node(){
        data=0;
        next = null;
    }
    public Node(int data, Node next){
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
