package maps;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {
    public static void main(String ...args){
        Pen p1 = new Pen(10,"blue");
        Pen p2 = new Pen(10,"blue");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.hashCode() == p2.hashCode());

        Set<Pen> pens = new HashSet<>();
        pens.add(p1);
        pens.add(p2);
        System.out.println(pens);
    }
}
