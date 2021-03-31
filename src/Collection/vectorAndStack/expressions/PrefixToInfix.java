package Collection.vectorAndStack.expressions;

import java.util.Scanner;
import java.util.Stack;

/*
the following function checks whether the given character is operator or not
 */
public class PrefixToInfix {
    static boolean isOp(char x) {   // parametrized function which return bool value if the given char is operator
        switch (x) {
            case '^':
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }

    /*
    this function converts the given prefix expression to infix taking exp as a param of type string which would return
    string
     */
    static String PreToInf(String exp) {
        Stack<String> st = new Stack<>(); // created a stack of string
        for (int i = exp.length() - 1; i >= 0; i--) { // for loop will traverse from length of string to 0th index
            char c = exp.charAt(i); // storing the index of each character in char variable 'c'.
            if (isOp(c)) { // this condition checks if the character 'c' is operator or not.
                String op1 = st.pop();   /* popping of the operands from stack of type string */
                String op2 = st.pop();
                String str = "(" + op1 + c + op2 + ")"; // concatenation of the operands, operator(between) and the parans into a string.
                st.push(str); // pushing the resultant string in the stack.
            } else {
                st.push(c + ""); // pushing the operands in the stack.
            }
        }
        return st.pop(); // returning the last removed element from the stack.
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter string");
        String str = s.nextLine();
        System.out.println(PreToInf(str));
    }
}
