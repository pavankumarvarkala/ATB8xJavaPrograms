package Nov.ex_04112024_CollectionFramework_Part_3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab214_Map_Part_2 {
    public static void main(String[] args) {
//        Map<String,Integer> map=new HashMap<String,Integer>();
//        Map<String,Integer> map=new HashMap<>();
//        Map<String,Integer> map=new HashMap();

        Map<String,Integer> map=new HashMap();
        map.put("id",1);
        map.put("id2",2);
        map.put("id3",34);
        map.put("id4",null);
        map.put(null,100);
        map.put(null,102);
        System.out.println(map);

        Map<String,Integer> map2=new LinkedHashMap();
        map2.put("id5",1);
        map2.put("id1",2);
        map2.put("id4",34);
        map2.put("id3",null);
        map2.put(null,100);
        map2.put(null,102);
        System.out.println(map2);

        Map<String,Integer> map1=new TreeMap();
        map1.put("id5",1);
        map1.put("id1",2);
        map1.put("id4",34);
        map1.put("id3",null);
//        map1.put(null,100);//java.lang.NullPointerException
//        map1.put(null,102);
        System.out.println(map1);
        System.out.println(map1.size());
        System.out.println(map1.isEmpty());
        System.out.println(map1.containsKey("id5"));
        System.out.println(map1.containsValue(34));
        System.out.println(map1.containsValue(99));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1.get("id5"));

        for (Map.Entry<String,Integer> item:map1.entrySet()){
            System.out.println(item.getKey()+ " -----> " +item.getValue());
        }




    }
}
