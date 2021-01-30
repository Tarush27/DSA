package Collection.LinkedList;

public class FinalLinkedListOutput {

    public static void main(String[] args){
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insertStart(1);
        sl.insertStart(2);
        sl.insertEnd(5);
        sl.insertStart(4);
        sl.insertAtPos(sl.head,3);
        sl.print();
        System.out.println();
        sl.deleteAtPos(3);
//        sl.deleteStart();
//        sl.print();
//        sl.deleteEnd();
//        System.out.println();
//        sl.print();
//        sl.deleteAtPos();
//        System.out.println();
//        sl.print();

    }
}
