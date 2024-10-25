package oct.ex_23102024.Exceptions;

public class Lab180 {
    public static void main(String[] args) {

        System.out.println("Start of the Program");
         //*********Bad Coding
        String ip= null; //ArrayIndexBound Exception
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        int a= 0; //java.lang.NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        int b= 0;  ////ArithmeticException
        try {
            b = 100/a;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}
