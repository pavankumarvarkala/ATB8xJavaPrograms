package oct.ex_28102024_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab204_ArrayList_iterate {
    public static void main(String[] args) {
        List<String> names=new ArrayList();
        names.add("Pawan");
        names.add("Kumar");
        names.add("Varkala");

        System.out.println("- To Print ArrayList-1 ");
        for (String str:names){
            System.out.println(str);
        }

        System.out.println("- To Print ArrayList-2 ");
        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));

        }

        System.out.println("- To Print ArrayList-3 ");

        //Iterator
        Iterator<String> iterator= names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
