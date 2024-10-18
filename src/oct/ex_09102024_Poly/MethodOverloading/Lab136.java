package oct.ex_09102024_Poly.MethodOverloading;

public class Lab136 {
    public static void main(String[] args) {
        MathOperations m=new MathOperations();
        System.out.println(m.add(5,7));
        System.out.println(m.add("Pawan"," Kumar"));
        System.out.println(m.add(10,20));
        System.out.println(m.add(100,200));
        System.out.println(m.add(100,300,20.30f));
    }
}
