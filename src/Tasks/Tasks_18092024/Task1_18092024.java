package Tasks.Tasks_18092024;

public class Task1_18092024 {
    public static void main(String[] args) {
        //Widening
        short s=10;
        long l=s;//implicit widening
        long l1=(long)s;//Explicit widening
        System.out.println(l1);

        //Narrowing

        float f=78.9888f;
//        int b = d; //implicit Narrowing
        int b=(int) f; //Explicit Narrowing
        System.out.println(b);//loss





    }
}
