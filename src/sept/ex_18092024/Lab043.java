package sept.ex_18092024;

public class Lab043 {
    public static void main(String[] args) {
        //GST=18.45
        int course=100;
        float GST=18.45f;

//        int total_price=course+GST;//Narrowing Implicit-JVM-Invalid
        int total_price=course+(int)GST;//Narrowing Explicit-JVM-loss
        System.out.println(total_price);

        float total_price1=course+GST; //Widening Implicit
        System.out.println(total_price1);

    }
}
