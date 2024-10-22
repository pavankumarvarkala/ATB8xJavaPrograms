package oct.ex_21102024_Wrapper_Exception;

public class Lab172_Exception {
    public static void main(String[] args) {

        int a=10;
        int b=a/0;//java.lang.ArithmeticException-Terminated.
        System.out.println(b);
        System.out.println("End");
    }
}
