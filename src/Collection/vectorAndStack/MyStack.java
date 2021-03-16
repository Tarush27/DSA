package Collection.vectorAndStack;

import Collection.LinkedList.SinglyLinkedList;

public class MyStack<E> {
    private final SinglyLinkedList<E> ll = new SinglyLinkedList<>();
    public void push(E e){
        ll.insertEnd(e);
    }
    E pop() throws Exception {
        if (ll.isEmpty()) {
            throw new Exception("No deletion in empty stack");
        }
        return ll.deleteEnd();
    }
    E peek() throws Exception {
        if (ll.isEmpty()) {
            throw new Exception("No peeking in empty stack");
        }
        return ll.getLast();
    }
}
