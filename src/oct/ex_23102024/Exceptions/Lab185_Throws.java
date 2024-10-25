package oct.ex_23102024.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab185_Throws {
    public static void main(String[] args) throws FileNotFoundException,Exception {

        FileInputStream file=new FileInputStream("asdfd.txt");


//        try {
//            int a=10/0;//Unchecked Exception-JVM don't know?
//        } catch (Exception e) {
//            throw new RuntimeException(e);
        

//        try {
//            FileReader f=new FileReader(new File("C://a.txt"));//Checked Exception
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

    }
}
