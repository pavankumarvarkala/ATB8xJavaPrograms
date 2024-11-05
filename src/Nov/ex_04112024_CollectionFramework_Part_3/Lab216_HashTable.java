package Nov.ex_04112024_CollectionFramework_Part_3;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab216_HashTable {
    public static void main(String[] args) {
        //HashMap-Allows 1 Null key
        //HashTable-Synchronised,slow,legacy class

        HashMap<Integer,String> hm=new HashMap();
        hm.put(1,"One");
        hm.put(2,"Two");
        hm.put(3,"Three");
        hm.put(4,null);
        hm.put(null,"null");
        hm.put(null,null);
        System.out.println(hm);

        Hashtable<Integer,String> ht=new Hashtable();
        ht.put(1,"One");
        ht.put(2,"Two");
        ht.put(3,"Three");
//        ht.put(4,null); //java.lang.NullPointerException
//        ht.put(null,"null");//java.lang.NullPointerException
//        ht.put(null,null);//java.lang.NullPointerException
        System.out.println(ht);

        Enumeration<Integer> e= ht.keys();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        Enumeration<Integer> e1= ht.keys();
        while (e1.hasMoreElements()){
            System.out.println(ht.get(e1.nextElement()));
        }



    }
}
