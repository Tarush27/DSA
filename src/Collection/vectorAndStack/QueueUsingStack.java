package Collection.vectorAndStack;

import java.util.Stack;

public class QueueUsingStack {

    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    static void enqueue(int x){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    static int dequeue(){
        while (!s1.isEmpty()){
            int x = s1.peek();
            s1.pop();
            return x;
        }
        return -1;
    }
    public static void main(String ...args){
        QueueUsingStack.enqueue(1);
        QueueUsingStack.enqueue(2);
        QueueUsingStack.enqueue(3);
        QueueUsingStack.enqueue(4);
        System.out.println(QueueUsingStack.dequeue());
        System.out.println(QueueUsingStack.dequeue());
        System.out.println(QueueUsingStack.dequeue());
        System.out.println(QueueUsingStack.dequeue());
    }
}
