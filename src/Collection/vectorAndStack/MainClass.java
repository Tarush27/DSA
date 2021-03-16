package Collection.vectorAndStack;

import java.util.Stack;
import java.util.Vector;

public class MainClass {
    public static void main(String[] args) throws Exception {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        int popped = stack.pop();
        System.out.println(popped);
        int top = stack.peek();
        System.out.println(top);

    }
}
