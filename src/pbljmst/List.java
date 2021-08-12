package pbljmst;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List {
    public static void main(String ...args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(0,4);
        al.add(2,5);
//        al.contains(2);
        Iterator iterator = al.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        LinkedList<Integer> li = new LinkedList<>();
    }
}
