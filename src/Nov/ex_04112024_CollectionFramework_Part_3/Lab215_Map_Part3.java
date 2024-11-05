package Nov.ex_04112024_CollectionFramework_Part_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Lab215_Map_Part3 {
    public static void main(String[] args) {

        HashMap<String,String> student=new HashMap();
        student.put("name","Pawan");
        student.put("rollNo","1");
        student.put("Phone","987654321");
        System.out.println(student);

        HashMap<String,String> student1=new HashMap();
        student1.put("name","Kumar");
        student1.put("rollNo","2");
        student1.put("Phone","34567654567");
        System.out.println(student1);

        List students=new ArrayList();
        students.add(student);
        students.add(student1);
        System.out.println(students);
        System.out.println(students.get(1));
        System.out.println(students.get(1).hashCode());

        Iterator it=students.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
