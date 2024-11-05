package Nov.ex_04112024_CollectionFramework_Part_3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab213_Map {
    public static void main(String[] args) {

        Map hm=new HashMap();//No order will be maintained

        hm.put("name","pawan");
        hm.put("rollNo",123);
        hm.put("phone",987654321);
        System.out.println(hm);
        System.out.println("--------------------------");

        Map lhm=new LinkedHashMap();//Order will be maintained as per insertion.
        lhm.put("name","pawan");
        lhm.put("rollNo",123);
        lhm.put("phone",987654321);
        System.out.println(lhm);
        System.out.println("--------------------------");

        Map tm=new TreeMap();//Sorted as per natural ordering of its keys.
        tm.put("name","pawan");
        tm.put("rollNo",123);
        tm.put("phone",987654321);
        System.out.println(tm);

    }
}
