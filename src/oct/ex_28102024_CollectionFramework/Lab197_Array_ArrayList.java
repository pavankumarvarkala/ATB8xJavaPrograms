package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;

public class Lab197_Array_ArrayList {
    public static void main(String[] args) {
        //Collection-Interface-10
        //List-Interface-15(25)
        //Array List,Linked List,Stack and Vector-Classes

        //Shopping-bread,milk,paneer,buttermilk,butter
        //Collection of items - with same or different data types
        //Collection of Students-

        ArrayList studentList=new ArrayList();
        studentList.add("Pramod");
        studentList.add("Dutta");
        studentList.add("Dutta"); //Duplicate is allowed.
        studentList.add("Pawan");
        studentList.add("Kumar");
        studentList.add(true); //Different data type is allowed.
        studentList.add(123);
        studentList.add(null);

        System.out.println(studentList);

//        Integer[] names=new Integer[5];-Fixed ,same Data Types.




    }








    //shopping list
    //milk,bread,butter,cheese
    //4 Elements
    //Collection Framework -> How You can Store the Elements.
    //1.List(Interface) -> Array List,Linked List,vector,Stack


}
