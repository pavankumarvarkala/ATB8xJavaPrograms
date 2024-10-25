package oct.ex_23102024.Exceptions;

public class Lab179_Parent {
    public static void main(String[] args) {
        int b=0;
        try {
            String ip=args[0]; //ArrayIndexBound Exception
            int a=Integer.parseInt(ip); //java.lang.NumberFormatException
            b=100/a;  ////ArithmeticException
            System.out.println(b);
        }
//        catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        }
//        catch (Object e) { //Cant use
//            System.out.println(e.getMessage());
//        }
    }
}
