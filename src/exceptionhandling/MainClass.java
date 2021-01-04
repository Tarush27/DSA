package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /*
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage() + " chek ur code");
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage() + "invalid index");
        }
        catch(IllegalArgumentException e2){
            System.out.println(e2.getMessage() + "illegal exception casting problem");
        }
        finally {
            System.out.println("Sorry ");

         */
        /*fun1();
        }
        static void fun1(){
        int a = 5;
        int b=2;
        int c=a/b;
        System.out.println(c);
        try {
            fun2();
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage() + " error");
        }
    }
    static void fun2() throws ArithmeticException{
        boolean isDanger = true;
        if (isDanger){
            throw new ArithmeticException("cant divide");
        }
    }
         */
        Scanner sc = new Scanner(System.in);
        try{
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x/y);
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass());
        }
        catch(ArithmeticException e1){
            System.out.println(e1);
        }
    }
}
