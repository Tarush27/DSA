package Collection.LinkedList;

public class FinalLinkedListOutput {

    public static void main(String[] args){
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insertStart(2);
        sl.insertStart(1);
        sl.insertEnd(1);
        sl.insertStart(3);
        sl.insertAtPos(sl.head,2);
        sl.print();
        System.out.println();
        sl.deleteAtPos(3);
        sl.isPalindrome();
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
