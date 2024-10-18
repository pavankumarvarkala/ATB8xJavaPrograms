package oct.ex_09102024_Poly.MethodOverriding.real;

public class Lab138 {
    public static void main(String[] args) {
        Pawan p=new Pawan();
        p.home();
        Father f=new Father();
        f.home();

        //Dynamic Dispatch
        Father obj=new Pawan();
        obj.home();
//        WebDriver driver=new ChromeDriver();->Dynamic Dispatch

        //Not Possible
//        Pawan objj=new Father();
    }
}
