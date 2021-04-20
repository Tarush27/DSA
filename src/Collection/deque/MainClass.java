package Collection.deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class MainClass {
    public static void main(String ...args){
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(1);
        ad.addFirst(2);
        ad.addFirst(3);
        ad.pop();
        ad.peek();
        System.out.println(ad.peek());
        ad.push(4);
        ad.push(5);
        ad.push(6);
//        ad.addFirst(7);
//        ad.addFirst(8);
//        ad.peekFirst();
//        ad.peekFirst();
        Iterator<Integer> iter = ad.iterator();
        while ( iter.hasNext()) {
            Integer it = iter.next();
            System.out.println(it);
        }
//        for (Iterator<Integer> iter = ad.descendingIterator(); iter.hasNext(); ) {
//            Integer it = iter.next();
//            System.out.println(it);
//        }
        Object[] a = ad.toArray();
        System.out.println(a.length);
//        System.out.println(ad.pop());
        System.out.println(ad.poll());
        System.out.println(ad.offerLast(5));
        System.out.println(ad.offerFirst(5));
        System.out.println(ad.clone());
        System.out.println(ad.contains(1));
        System.out.println(ad.contains(7));
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.push(10);
        ad1.push(11);
        ad1.push(12);
        ad1.push(1);
        ad1.push(6);
        System.out.println(ad.retainAll(ad1));
        System.out.println(ad1);
    }

}
