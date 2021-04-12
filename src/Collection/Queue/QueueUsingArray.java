package Collection.Queue;

public class QueueUsingArray {
    private static int front, rear, capacity;
    private static int[] queue;

    QueueUsingArray(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    static void enqueue(int item) {
        if (rear == capacity) {
            System.out.println("Overflow");
            return;
        }
        queue[rear] = item;
        rear++;
    }

    static int dequeue() {
        int y = 0;
        if (front == rear) {
            System.out.println("Underflow");
        } else {
            y = queue[front];
            front++;
        }
        return y;
    }

    static void show() {
        if (front == rear) {
            System.out.println("Queue empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.println(queue[i]);
        }
    }

    static void front() {
        if (front == rear) {
            System.out.println("Queue empty");
            return;
        }
        System.out.println("Front is : " + queue[front]);
        return;
    }
}
