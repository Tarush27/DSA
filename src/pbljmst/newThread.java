package pbljmst;

import java.util.Collections;
import java.util.TreeMap;

class multithreaded_programming{
    public static void main(String ...args){
        TreeMap tm1;
        tm1 = new TreeMap();
        for(int i = 2;i<=10;i+=2){
            tm1.put(i,Math.pow(i,2));
        }
        System.out.println(tm1.ceilingEntry(5));
        System.out.println(tm1.ceilingKey(5));
//        System.out.println("Floor Key:" + tm1.tailMap(6,false));
    }
}
