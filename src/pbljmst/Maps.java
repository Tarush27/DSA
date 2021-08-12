package pbljmst;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String ...args){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("Tarush",2068);
        hm.put("Tushar",2065);
        hm.put("Kamal",2061);
//        hm.put("Kamal",2061);
        hm.put("Anil",null);
        hm.put("T",null);
//        hm.put(null,null);
//        hm.put(null,50);
//        for (Map.Entry m: hm.entrySet()){
//            System.out.println(m.getKey() + " " + m.getValue());
//        }
        hm.putIfAbsent("Anu",4);
        for (Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }
//        HashMap<String, Integer> h1 = new HashMap<>();
//        h1.putAll(hm);
        hm.remove("Tarush");
        System.out.println("updated items :" + hm);
        hm.remove("T",null);
        System.out.println("updated items :" + hm);
        hm.replace("Anu",3);
        System.out.println("updated list : " + hm);
        hm.replace("Kamal",2061,2062);
        System.out.println("updated list : " + hm);
        hm.replaceAll((k,v) -> v * v);
        System.out.println("updated list : " + hm);
    }
}
