package Nov.ex_04112024_Generics;

public class Lab218_Generics_Creation {
    public static void main(String[] args) {
        temp("Pawan");
        temp(20);
        temp(true);
    }
    //T- Ref - It can be Anything
    public static <T> void temp(T a){
        System.out.println(a);
    }
}
