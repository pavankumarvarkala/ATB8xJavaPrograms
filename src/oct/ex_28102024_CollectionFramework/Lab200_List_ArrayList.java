package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab200_List_ArrayList {
    public static void main(String[] args) {
        //    List list=new List();

        List list=new ArrayList();
        list.add("Bread"); //0
        list.add("Milk");  //1
        list.add("Butter"); //2
        list.add("Paneer"); //3
        list.add("Jam"); //4
        list.add("Cheese"); //5
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1)); //false
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf("1"));
        System.out.println(list.indexOf("3")); //find the first occurrence of element
        System.out.println(list.lastIndexOf("3"));



        
    }

}