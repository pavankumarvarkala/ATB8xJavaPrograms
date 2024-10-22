package oct.ex_16102024_Static_Keyword;

public class Lab157 {
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();
        new A();
        A a3;

    }
}
class A{
    {
        System.out.println("IIB");
    }

    static {
        System.out.println("SIB");
    }
}
