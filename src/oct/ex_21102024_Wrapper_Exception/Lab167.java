package oct.ex_21102024_Wrapper_Exception;

public class Lab167 {
    public static void main(String[] args) {
        //primitive to wrapper class
        int a=10;
        Integer b=a;//Boxing-int->Integer
        System.out.println(b);
        System.out.println(b.doubleValue());
        System.out.println(b);

        Integer a1=42;
        int val=a1;//unboxing-Integer->int
        System.out.println(val);
    }
}
