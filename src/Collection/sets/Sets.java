package Collection.sets;

import java.util.*;

public class Sets {
    public static void main(String ...args){
//        Set<String> set = new HashSet<>();
//        set.add("a");
//        set.add("b");
//        set.add("c");
//        set.add("c");
//        System.out.println(set);
//        set.remove("b");
//        System.out.println(set);
//        System.out.println(set.remove("b"));
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(set.size());
//        System.out.println(set);
//        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 3, 2, 4, 8, 9, 0));
//        Set<Integer> s2 = new HashSet<>(Arrays.asList(1, 3, 7, 5, 4, 0, 7, 5));
//        Set<Integer> union1 = new HashSet<>(s1);
//        union1.addAll(s2);
//        System.out.println("union is : " + union1);
//        Set<Integer> intersection1 = new HashSet<>(s1);
//        intersection1.retainAll(s2);
//        System.out.println("intersection is : " + intersection1);
//        Set<Integer> diff1 = new HashSet<>(s1);
//        diff1.removeAll(s2);
//        System.out.println("difference is : " + diff1);
//        Set<Integer> union = new HashSet<>(s2);
//        union.addAll(s1);
//        System.out.println("union is : " + union);
//        Set<Integer> intersection = new HashSet<>(s2);
//        intersection.retainAll(s1);
//        System.out.println("intersection is : " + intersection);
//        Set<Integer> diff = new HashSet<>(s2);
//        diff.removeAll(s1);
//        System.out.println("difference is : " + diff);

        TreeSet<String> ts = new TreeSet<>();
        ts.add("a");
        ts.add("b");
        ts.add("c");
        ts.add("d");
        ts.add("e");
        Iterator<String> itr = ts.iterator();

        System.out.println();
        Iterator<String> it = ts.descendingIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("highest removed value is : " + ts.pollFirst());
        System.out.println("lowest removed value is : " + ts.pollLast());

        System.out.println(ts.descendingSet());
        System.out.println(ts.headSet("d",true));
        System.out.println(ts.subSet("a",false,"d",false));
        System.out.println(ts.tailSet("d",false));

        System.out.println(ts.headSet("d"));
        System.out.println(ts.subSet("a","d"));
        System.out.println("tail set : " + ts.tailSet("d"));

        System.out.println(ts.contains("b"));
        for (String v : ts){
            System.out.println(v);
        }
    }
}
