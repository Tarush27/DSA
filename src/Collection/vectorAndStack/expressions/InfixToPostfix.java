package Collection.vectorAndStack.expressions;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    // this precedence function would check the priority of the operators.
    static int Precedence(char ch){
        switch (ch){
            case '^':         // exponent has the highest priority
                return 1;
            case '*':          // * and / has medium priority
            case '/':
                return 2;
            case '+':            // + and - has lowest priority
            case '-':
                return 3;
        }
        return -1;
    }

    // iToP function would convert the infix exp to postfix exp.
    static String iToP(String exp){
        String res = "";// initialized empty string
        Stack<Character> st = new Stack<>();// created a stack of characters
//        for(int i : exp){
//            char c = (char) exp.length();
//        }
        for(int i = 0;i<exp.length();++i) {    // this for loop does the whole process and iterates till the length of
            //  expression
            char c = exp.charAt(i);        // checking the index of each character and storing in character type variable
            if (Character.isLetterOrDigit(c))  // checking if the character is of type letter or not and then adding that
                // character in the result
                res += c;
            else if (c == '(')   // if the exp contains opening parans or not and then pushing into stack if found
                st.push(c);
            else if (c == ')') {    // if the exp contains closing brackets then checking whether the stack is empty
                // along with the peek element of the stack should not be "(" and accordingly
                // poping the character and adding into the result.
                while (!st.isEmpty() && !(st.peek() == '(')) {
                    res += st.pop();
                }
                st.pop(); // popping the remaining elements if the opening brackets are found and underflow condition can occur.
            } else {
                while (!st.isEmpty() && Precedence(c) <= Precedence(st.peek())) { // checking the precedence of the
                    // operators and the popping accordingly
                    // along with pushing process.
                    res += st.pop();
                }
                st.push(c);
            }
        }
            while(!st.isEmpty()){
                if (st.peek() == '('){// condition for returning of invalid expression
                    return "Invalid Expression";
                }
                res += st.pop();//again popping the elements
            }
        return res; // return the string after all the chars have been popped and exp is evaluated.
    }
    public static void main(String[] args){ // main function
        Scanner sc = new Scanner(System.in);  // taking scanner for user input
        System.out.println("enter the string");
        String exp = sc.nextLine();  // reading the string
        System.out.println(iToP(exp)); // passing the function along with the string and printing it.
    }
}
