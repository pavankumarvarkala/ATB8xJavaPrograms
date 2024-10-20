package oct.ex_11102024_Encapsulation.superKeyword;

public class Lab145 {
    public static void main(String[] args) {
        BaseClass b=new TestClass();//Dynamic Dispatch
//        BaseClass b1=new BaseClass();
//        TestClass t=new TestClass();

        b.openBrowser();
        b.openBrowser("edge");
        b.closeBrowser();
    }
}
