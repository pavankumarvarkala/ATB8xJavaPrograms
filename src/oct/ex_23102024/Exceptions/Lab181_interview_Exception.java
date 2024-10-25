package oct.ex_23102024.Exceptions;

public class Lab181_interview_Exception {
    public static void main(String[] args) {

        try {
            String s1="Pawan";
            String a1=args[0];
            int a=10/0;
            s1=null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is some problem with the code");
            System.out.println(e.getMessage());
        }
        System.out.println("End of the program");

    }
}
