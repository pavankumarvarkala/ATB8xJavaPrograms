package oct.ex_21102024_Wrapper_Exception;

import java.io.FileInputStream;

public class Lab171_Exceptions {
    public static void main(String[] args) {

        //Checked Exception->When JVM Knows about it.
//        FileInputStream file =new FileInputStream("c:a.txt");
        //JVM Knows that this file may not exist.

        //Unchecked Exception-Arithmetic Exception
        int a=10;
        int b=a/0;
        System.out.println(b);
    }
}
