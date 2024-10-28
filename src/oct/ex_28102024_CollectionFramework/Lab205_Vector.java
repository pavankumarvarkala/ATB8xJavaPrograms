package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab205_Vector {
    public static void main(String[] args) {
        List mylist=new ArrayList(5);
        mylist.add("Pavan");
        mylist.add("Kumar");
        mylist.add("Varkala");
        mylist.add("Shiva");
        mylist.add("Teja");
        mylist.add("Penugonda");
        System.out.println(mylist);

        Vector v=new Vector();
        v.add("Pavan"); //t1
        v.add("Kumar");
        v.add("Varkala");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        System.out.println(v.indexOf("Kumar"));
        System.out.println(v.lastIndexOf("Kumar"));
        System.out.println(v.contains("Kumar"));
//        System.out.println(v.replaceAll("Kumar"););

        //Only Problem with vector-It is Thread Safe,Synchronised.
        //It will be time-consuming
        //One By One - Usage
        //Slower
    }
}
