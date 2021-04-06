package Collection.LinkedList;

public class SinglyLinkedList<E> {

    Node<E> head;

    int size = 0;

    public void deleteStart() {
        Node n1 = head;
        if (isEmpty()) {
            head = n1;
            return;
        }
        head = head.next;
    }

    public E deleteEnd() throws Exception {
        Node<E> temp = head;
        if (temp == null) {
            throw new Exception("Cannot remove last element from empty linked list");
        }
        if (temp.next == null) {
            Node<E> n2 = head;
            head = null;
            return n2.data;
        }
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node<E> n2 = temp.next;
        temp.next = null;
        return n2.data;
    }

    public E getLast() throws Exception {
        Node<E> temp = head;
        if (temp == null) {
            throw new Exception("Cannot peek last element from empty linked list");
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void deleteAtPos(int pos) {
        if (head == null) {
            return;
        } else {
            Node n3 = head;
            Node t = null;
            for (int i = 0; i <= pos - 1; i++) {
                t = n3;
                n3 = n3.next;
            }
            t.next = n3.next;
        }

    }

    public void insertStart(int v) {
        Node n = new Node(v);
        n.next = head;
        head = n;
    }

    public void insertEnd(E data) {
        Node<E> n = new Node(data);
        Node<E> t = head;
        if (isEmpty()) {
            head = n;
            return;
        }
        while (t.next != null) {
            t = t.next;
        }
        t.next = n;
    }

    public void insertAtPos(Node head, int v) {
        if (head == null) {
            System.out.println("cannot be null");
            return;
        }
        Node n = new Node(v);
        n.next = head.next;
        head.next = n;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        Node<E> t = head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    public Node reverseList(Node temp) {
        Node cur = temp;
        Node prevNode = null, nextNode = null;
        while (cur != null) {
            nextNode = cur.next;
            cur.next = prevNode;
            prevNode = cur;
            cur = nextNode;
        }
        return prevNode;
    }

    public void isPalindrome() {
        Node current = head;
        boolean flag = true;
        int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        Node revHead = reverseList(current.next);
        while (head != null && revHead != null) {
            if (head.data != revHead.data) {
                flag = false;
                break;
            }
        }
        head = head.next;
        revHead = revHead.next;
        if (flag) {
            System.out.println("List is palindrome");
        } else {
            System.out.println("List is not a palindrome");
        }
    }

    public static class Node<E> {
        E data;
        public Node<E> next;

        public Node(E data) {
            this.data = data;
            next = null;
        }
    }
}
