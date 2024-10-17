package sept.ex_30092024;

public class Lab121_functions {
    public static void main(String[] args) {

        functionName();
        greet();
        greet();
        greet();
        for (int i = 0; i <100 ; i++) {
            greet();
        }

    }
   public static void functionName(){
       System.out.println("This is void function");
    }

    //Define
    //1.No Return Type and No Argument/1.without parameters and without return type
    public static void greet(){
        System.out.println("Hi");
    }

}
