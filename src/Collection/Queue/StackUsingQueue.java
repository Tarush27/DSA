package Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    // two inbuilt queues
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    static int size; // size of the stack

    // constructor for initializing size of stack
    StackUsingQueue(){
        size = 0;
    }

    // static function for push containing item as a parameter
    void push(int item){
        size++; // initially incrementing size
        q2.add(item);  // adding item in the q2
        while (!q1.isEmpty()){ // checking if the q1 is not empty for adding the element
            /*
                removing element one by one from q1 and adding into q2 & then removing from q1.
             */
            q2.add(q1.peek());
            q1.remove();
        }
        // swapping of the 2 q's
        q1 = q2;
        q2 = q1;
    }
    // static function pop for removing elements
    static int pop(){
        if (!q1.isEmpty()){ // check if the q1 is not empty for removing elements
            q1.remove(); // removing elements
            size--;  // after removing decreasing the size
        }
        return -1;  // if q1 is empty, then return -ve index
    }
    // function for returning top of the stack
    static int top(){
        if (!q1.isEmpty()){ // check if the q1 is not empty for removing elements
            return q1.peek(); // returning top most element from stack
        }
        return -1; // if q1 is empty, then return -ve index
    }
    // function for getting size of the stack
    static int size(){
        return size;  //returns size of the queue
    }
}
