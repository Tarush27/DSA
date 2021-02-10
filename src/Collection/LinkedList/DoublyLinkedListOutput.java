package Collection.LinkedList;

public class DoublyLinkedListOutput {
    public static void main(String[] args){
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertEnd(6);
        dll.insertStart(1);
        dll.insertStart(2);
        dll.insertMiddle(dll.head, 5);
        dll.insertStart(3);
        dll.insertStart(4);
        dll.printList(dll.head);
        dll.deleteStart();
        System.out.println();
        dll.deleteEnd();
        System.out.println();
        dll.deletePos(2);
        dll.printList(dll.head);
        System.out.println();
        System.out.println("Resultant nodes are : " + dll.countNodes());
    }
}
