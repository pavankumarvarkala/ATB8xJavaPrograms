package oct.ex_21102024_Wrapper_Exception;

public class Lab173_Exception {
    public static void main(String[] args) {

        //Unchecked -java.lang.NullPointerException
        //JVM-at run time-Terminated the program
        System.out.println("Start");
        String s1=null;
        System.out.println(s1.trim());
        System.out.println("End");
    }

}
