package oct.ex_11102024_Encapsulation.superKeyword;

public class TestClass extends BaseClass{
    TestClass(){
        super();//DC of Parent
        this.setBrowser("edge",true);
    }

    @Override
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser, isAuth);

    }
}
