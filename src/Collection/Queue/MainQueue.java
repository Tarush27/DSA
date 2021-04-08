package Collection.Queue;

public class MainQueue {
    public static void main(String ...args){
        QueueUsingArray q = new QueueUsingArray(4);
        QueueUsingArray.enqueue(10);
        QueueUsingArray.enqueue(20);
        QueueUsingArray.enqueue(30);
        QueueUsingArray.enqueue(40);
    }
}
