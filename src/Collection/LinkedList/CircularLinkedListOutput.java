package Collection.LinkedList;

public class CircularLinkedListOutput {
    public static void main(String[] args){
        CircularLinkedList cl = new CircularLinkedList();
        cl.addStart(0);
        cl.addEnd(1);
        cl.addStart(5);
        cl.addMid(cl.head,9);
        cl.addEnd(2);
        cl.addStart(6);
        cl.addMid(cl.head,10);
        cl.addEnd(3);
        cl.addStart(7);
        cl.addMid(cl.head,11);
        cl.addEnd(4);
        cl.addMid(cl.head,8);
        cl.show();
        cl.deleteStart();
        cl.show();
        cl.deleteEnd();
        cl.show();
        cl.deleteMid();
        cl.show();
    }
}
