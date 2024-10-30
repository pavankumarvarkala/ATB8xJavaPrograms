package oct.ex_30102024_CollectionFramework_Part_2;

import java.util.Stack;

public class Lab208_Stack {
    public static void main(String[] args) {
        //Vector,Stack ->95% of time we are not going to use it in Automation.

        //ArrayList -> 95% time we use it.

        Stack s=new Stack();
        s.add("Pawan");
        s.add("kumar");
        System.out.println(s);  //LIFO(Last In First Out)

        Stack books=new Stack();
        books.push("Python");
        books.push("Java");
        books.push("C#");
        System.out.println(books);
        System.out.println(books.peek());
        System.out.println(books.pop());
        System.out.println(books);

        Stack s1=new Stack();
        s1.push("Shiva");
        s1.push("Teja");
        s1.push("varkala");
        s1.add("pengugonda");
        System.out.println(s1.size());
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1);
        System.out.println(s1.pop());
        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.empty());
        System.out.println(s1.add("Chitti"));
        System.out.println(s1);
        s1.add(0,"Lucky");
        System.out.println(s1);




    }
}
