package oct.ex_09102024_Poly.MethodOverloading;

public class MathOperations {
    //Method Overloading->Same name but diff para/argument or return type
    int add(int a,int b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }

    void add(int a,int b,int c){
        System.out.println("Hello");
    }

    double add(double a,double b){
        return a+b;
    }
    double add(double a,double b,float f){
        return a+b+f;
    }
    long add(long a,long b){
        return a+b;
    }
}
