package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab202_List_ArrayList {
    public static void main(String[] args) {
        //    List list=new List();

        List marks=new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);
        System.out.println(marks);
        //sorting
        Collections.sort(marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);




        
    }

}
