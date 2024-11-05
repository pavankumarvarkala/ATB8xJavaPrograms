package Nov.ex_04112024_Generics;

public class Lab218_Generics_Part_2 {
    public static void main(String[] args) {
        printTs(10,"pawan",true);

        Math.max(1,2); //int
        Math.max(1.3,2.4); //double
        Math.max(1.33f,2.73f); //float
        Math.max(12342345l,2345678l); //long

    }
    public static <T1,T2,T3> void printTs(T1 a,T2 b,T3 c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
