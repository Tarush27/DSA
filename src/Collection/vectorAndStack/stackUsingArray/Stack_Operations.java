package Collection.vectorAndStack.stackUsingArray;

import java.util.Scanner;

public class Stack_Operations {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Stack Operation using Array Implementation");
        while (choice != 5) {
            System.out.println("chose one of below options");
            System.out.println("\n 1.Push \n 2.Pop \n 3.Show \n 4.Peek \n 5.Exit");
            System.out.println("enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    ms.push(sc);
                    break;
                }
                case 2: {
                    ms.pop();
                    break;
                }
                case 3: {
                    ms.display();
                    break;
                }
                case 4: {
                    System.out.println(ms.peek());
                    break;
                }
                case 5: {
                    System.out.println("exiting");
                    System.exit(0);
                }
                default: {
                    System.out.println("invalid choice");
                }
            }
        }
    }
}
