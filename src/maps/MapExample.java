package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String ...args){
//        Map<Integer,String> map = new HashMap<>();
//        map.put(1,"a");
//        map.put(2,"a");
//        map.put(3,"a");
//        System.out.println(map);
//        for (Map.Entry<Integer,String> m: map.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
//        map.put(2,"b");
//        System.out.println(map);
//        map.remove(3);
//        System.out.println(map);
//        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//
//            HashMap<Integer,String> hm = new HashMap<>();
//            hm.put(1,"a");
//            hm.put(2,"b");
//            hm.put(3,"a");
//            hm.put(null,"a");
//            hm.put(4,null);
//            hm.put(5,null);
//            hm.put(6,null);
//            System.out.println(hm);
//            hm.putIfAbsent(7,null);
//        System.out.println(hm);
//        hm.remove(3);
//        System.out.println(hm);
//        hm.replace(4,"ta");
//        System.out.println(hm);
//        System.out.println(hm.isEmpty());

        TreeMap<Integer,Integer> tm = new TreeMap<>();
        tm.put(2,10);
        tm.put(1,20);
        tm.put(4,30);
        tm.put(3,40);
//        System.out.println(tm.descendingMap());
//        System.out.println(tm.headMap(2,true));
//        System.out.println(tm.tailMap(2,true));
//        System.out.println(tm.subMap(1,false,4,true));
        System.out.println(tm.headMap(2));
        System.out.println(tm.tailMap(1));
        System.out.println(tm.subMap(2,4));
//        System.out.println(tm);
//        for (Map.Entry<Integer,Integer> m: tm.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
//        tm.put(2,null);
//        tm.put(1,null);
//        System.out.println(tm);
    }

}
