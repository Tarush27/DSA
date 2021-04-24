package Collection.priorityQueue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQ {

   public static void main(String ...args){
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       pq.add(1);
       pq.add(2);
       pq.add(3);
       pq.add(4);
       System.out.println(pq);
       pq.remove();
       System.out.println(pq);
       Iterator iterator = pq.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
//       System.out.println(pq);
       System.out.println(pq.contains(3));
//       System.out.println(pq.contains(5));
       pq.offer(5);
       System.out.println(pq);
       System.out.println(pq.contains(5));
//       System.out.println(pq.peek());
//       System.out.println(pq.remove());
//       System.out.println(pq);
//       System.out.println(pq.remove());
//       System.out.println(pq);
//       System.out.println(pq.remove());
//       System.out.println(pq);
//       System.out.println(pq.remove());
//       System.out.println(pq);
//       System.out.println(pq.peek());
//       System.out.println(pq);
//       System.out.println(pq.element());
//       System.out.println(pq);
//       pq.clear();
       System.out.println(pq);
       Queue<Integer> q = new PriorityQueue<>();
       q.add(2);
       q.add(3);
       q.add(50);
       pq.retainAll(q);
       System.out.println(pq);
       pq.removeAll(q);
       System.out.println(pq);
       pq.addAll(q);
       System.out.println(pq);
       System.out.println(pq.size());
   }
}
