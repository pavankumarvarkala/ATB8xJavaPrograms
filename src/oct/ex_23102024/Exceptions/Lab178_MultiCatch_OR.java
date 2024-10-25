package oct.ex_23102024.Exceptions;

public class Lab178_MultiCatch_OR {
    public static void main(String[] args) {
        try {
            String ip=args[0]; //ArrayIndexBound Exception
            int a=Integer.parseInt(ip); //java.lang.NumberFormatException
            int b=100/a;  ////ArithmeticException
            System.out.println(b);
        }
        catch (ArrayIndexOutOfBoundsException|NumberFormatException|ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("End");

        }
        //JVM Will be initialized
        //Creates and Starts the main Thread
        // main thread will do the following tasks
        //1)Collects command Line Arguments
        //2)Creates String Array with Command Line Arguments(CLA)
        //3)Call main method by passing the string array as parameter.
        //4)Lab178.main(CLA)

        //Now Control will be transferred from main Thread to main method.
        //Control will come back to main thread in two ways:
        //A)When problem comes in main->JVM will do the following
        //Creates the object of Identified exception class.
        //Exception e=new Exception();

    }
}
