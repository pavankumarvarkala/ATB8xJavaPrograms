package oct.ex_21102024_Wrapper_Exception;

public class Lab168 {
    public static void main(String[] args) {
        String num="10";
//        int a=num;//non-primitive ->primitive
        Integer a=Integer.valueOf(num);
        System.out.println(a);
        int a2=a;//unboxing

        //String to primitive
        int a3=Integer.parseInt(num);
    }
}
