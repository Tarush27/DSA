package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
    Queue<Integer> q = new LinkedList<>();
    void push(int item){
        int size = q.size();
        q.add(item);
        for (int i = 0;i<size;i++){
            int x = q.remove();
            q.add(x);
        }
    }
    int pop(){
        if (!q.isEmpty()){
            q.remove();
        }
        return -1;
    }
    int top(){
        if (!q.isEmpty()){
            return q.peek();
        }
        return -1;
    }
    boolean isEmpty(){
        return q.isEmpty();
    }
}
