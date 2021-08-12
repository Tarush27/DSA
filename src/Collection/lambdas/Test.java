package Collection.lambdas;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        FI fi = System.out::println;
        fi.abstractFun(10);
        FI fi1 = (int x) -> System.out.println(2*x);
        fi1.abstractFun(10);

        // created array list of integers.
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);          // elements added...
        al.add(4);
        // iterating over the elements using for each loop.
        // using lambda...
        // using method reference and consumer -> action.
        al.forEach(System.out::println);
        al.forEach(n -> {if (n%2==0) System.out.println(n);});
        // thread using lambda
        Runnable r = () -> System.out.println("thread is running");
        Thread thread = new Thread(r);
        thread.start();
    }
}
