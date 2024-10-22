package oct.ex_21102024_Wrapper_Exception;

public class Lab170_Exception {
    public static void main(String[] args) {
        System.out.println("Start of the Program");
        String ip=args[0];//10
        int a=Integer.parseInt(ip);
        int b=1000/a;
        System.out.println(b);
        System.out.println("End of the Program");

        //JVM will be initialized
        //Creates and Starts main thread-main will be called
        //1.Collects the command line arguments.-10
        //String[] args=[10]->
        //2.Lab170_Exception.main()
        //Now control will be transferred from main Thread to main method

        //When a problem comesin main-JVM
        //if you don't handle the exception JVM will handle it.
        //Always Terminate the program


//        String ip1=args[1];//10
//        String ip2=args[2];//10
//        System.out.println(ip);
//        System.out.println(ip1);
//        System.out.println(ip2);
    }
}