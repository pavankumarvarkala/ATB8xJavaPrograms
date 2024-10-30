package oct.ex_30102024_CollectionFramework_Part_2.ex_30102024_CollectionFramework_SET;

import java.util.*;

public class Lab210_SET {
    public static void main(String[] args) {
        //List - Duplicates are Allowed.
        //Set - Doesn't allow Duplicate.



        Set hs=new HashSet();//Hashing Mechanism is used to store the elements, No order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Watermelon");
        hs.add(null);
        System.out.println(hs);

        Set lhs=new LinkedHashSet();//LinkedList Mechanism is used to store the elements,order is maintained
        lhs.add("Apple");
        lhs.add("apple");
        lhs.add("Orange");
        lhs.add("Watermelon");
        lhs.add("Watermelon");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        Set ts=new TreeSet();//Black and Red Tree Mechanism to store the element,order maintained.
        //order will be maintained and natural sorting is done
        ts.add("Dapple");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Orange");
//        ts.add(123); //java.lang.ClassCastException
        ts.add("Watermelon");
//        ts.add(null); //java.lang.NullPointerException
        System.out.println(ts);

        for (Object o:ts){
            System.out.println(o);
        }
        System.out.println("--------------------");
        Iterator it= ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
