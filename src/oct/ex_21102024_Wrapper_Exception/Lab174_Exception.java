package oct.ex_21102024_Wrapper_Exception;

public class Lab174_Exception {
    public static void main(String[] args) {
        int c=10;
        try {
            c=10/c;
            String s1=null;
            s1.trim();
            System.out.println(c);
        } catch (ArithmeticException |NullPointerException e) {
            System.out.println(e);
        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
        System.out.println("End");

        //Integer.parseInt()->converts String to integer
//        Integer.valueOf()->int->int or String->int
    }
}
