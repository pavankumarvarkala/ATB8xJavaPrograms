package oct.ex_23102024.Exceptions;

import java.io.FileInputStream;

public class Lab177_MultiCatch {
    public static void main(String[] args) {


        try {
            String ip=args[0]; //ArrayIndexBound Exception
            int a=Integer.parseInt(ip); //java.lang.NumberFormatException
            int b=100/a;  ////ArithmeticException
            System.out.println(b);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End");

        }


        //Exceptions
        //1.Checked-JVM Knows about it
//        FileInputStream f=new FileInputStream("C:/log.txt");
        //File io-open
//        try {
//            FileInputStream f = new FileInputStream("C:/log.txt");
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//
//        }
//
//
//        //2.Unchecked-JVM Doesn't know about it.
//        int a=10;
//        int b=a/0;
//        System.out.println(b);
//
//        String s1=null;
//        s1.trim();

    }
}
