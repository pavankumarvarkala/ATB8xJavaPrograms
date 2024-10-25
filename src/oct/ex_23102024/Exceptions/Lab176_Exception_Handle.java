package oct.ex_23102024.Exceptions;

public class Lab176_Exception_Handle {
    public static void main(String[] args) {
        int a=0;
        try {
            int c=10/a; //Arithmetic Exception
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new ArithmeticException();
        } finally {
            System.out.println("I will always be executed");
        }

//        String s1=args[0];//5
//        int x=Integer.parseInt(s1);//String(100)->int(100)->int x=5
//        int a1=10/x;//10/5=2;
//        System.out.println(x);//5
//        System.out.println(a);//2

        //Test Cases for the program
        //5->Happy TC-No Exception
        //No input-ArrayIndexBound Exception
        //0-Arithmetic Exception
        //-5-No Exception
        //Pramod-java.lang.NumberFormatException
        //2.84-java.lang.NumberFormatException
        //!@#$%^&*()-java.lang.NumberFormatException

        //NumberFormatException
        //ArrayIndexOutOfBoundsException
        //ArithmeticException
    }
}
