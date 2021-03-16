package Collection.vectorAndStack.stackUsingArray;

import java.util.Scanner;

public class MyStack {
    int top; // top of the stack
    int capacity = 5; // capacity of the stack
    int[] a = new int[capacity];

    boolean isEmpty(){
        return (top < 0);
    }

    MyStack() {
        top = -1;
    }
    boolean push(Scanner sc){
        if(top == capacity - 1){
            System.out.println("Overflow");
            return false;
        }
        else{
            System.out.println("Enter a value");
            int val = sc.nextInt();
            a[++top] = val;
            System.out.println("item pushed");
            return true;
        }
    }
    boolean pop(){
        if(top == -1){
            System.out.println("Underflow");
            return false;
        }
        else{
            top--;
            System.out.println("value deleted");
            return true;
        }
    }
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = a[top];
            return x;
        }
    }
    void display(){
        System.out.println("Stack Elements Are");
        for(int i = top;i>=0;i--){
            System.out.println(a[i]);
        }
    }

}
