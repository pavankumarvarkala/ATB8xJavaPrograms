package sept.ex_30092024;

public class Lab122 {
    public static void main(String[] args) {
        //1.Without Parameters and without Return Type
        functionType1();

        //2.Without Parameters but with Return Type
        String name=functionType2();
        System.out.println(name);

        //3.With Parameters and without Return Type
        functionType3(34,"pawan","varkala");

        //4.With Parameters and with Return Type
         int age=functionType4(30,40);
        System.out.println(age);

    }

    //1.Without Parameters and without Return Type
    public static void functionType1(){
        System.out.println("1.Without Parameters and without Return Type");
    }

    //2.Without Parameters but with Return Type
    public static String functionType2(){
        System.out.println("2.Without Parameters but with Return Type");
        return "pawan";
    }

    //3.With Parameters and without Return Type
    public static void functionType3(int age,String name,String fname){
        System.out.println("3.With Parameters and without Return Type");
        System.out.println("You have shared-> "+age);
        System.out.println("You have shared-> "+name);
        System.out.println("You have shared-> "+fname);

    }
    //4.With Parameters and with Return Type
    public static int functionType4(int a,int b){
        System.out.println("4.With Parameters and with Return Type");
        return a+b;



    }

}
