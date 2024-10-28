package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab201_List_ArrayList_ForLoop {
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

        System.out.println("---------------default for loop");

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }

        System.out.println("--------------------for each Loop");

        for(Object o:list){
            System.out.println(o);
        }




    }

}
