package oct.ex_14102024_Abstraction;

public class Lab153 {

}

interface I3{
    default void start(){
        System.out.println("Start DM");
    }
    default void stop(){
        System.out.println("Stop DM");
    }
    void f1();

    static void ss(){
        System.out.println("Static can also have body in interface");
    }

}
abstract class AA{
    void f2(){
        System.out.println("Concrete method");
    }
    //abstract method
    abstract void f3();

    static void f4(){
        System.out.println("Yes");
    }


}
