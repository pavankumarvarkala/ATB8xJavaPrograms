package oct.ex_23102024.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab183_Unchecked_Checked_Example {
    public static void main(String[] args) {

        try {
            int a=10/0;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Unchecked Exception");
        }

        try {
            String path="C://a.txt";
            File file=new File(path);
            FileReader fileReader=new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Checked Exception");
        }
//        finally {
//            System.out.println("Checked Exception"); multiple finally not possible.
//        }
    }
}
