package Collection.Queue;

import Collection.LinkedList.SinglyLinkedList;

public class MyQueue<E> {
    private SinglyLinkedList.Node<E> head,rear;
    public void enqueue(E e){
        SinglyLinkedList.Node<E> node = new SinglyLinkedList.Node<>(e);
        if (head == null){
            head = rear = node;
            return;
        }
        rear.next = node;
        rear = rear.next;
    }
    public E dequeue(){
        if (head == null){
            return null;
        }
        SinglyLinkedList.Node<E> temp = head;
        head = head.next;

        if (head == null){
            rear = null;
        }

        return temp.data;
    }
}
