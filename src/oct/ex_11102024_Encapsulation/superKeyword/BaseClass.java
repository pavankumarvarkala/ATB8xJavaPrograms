package oct.ex_11102024_Encapsulation.superKeyword;

public class BaseClass {
    private String browser;

    BaseClass(){

        System.out.println("DC-BaseClass");
    }

    BaseClass(String b){
        System.out.println("PC-BaseClass");
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {

        if(isAuth){
            this.browser = browser;
            System.out.println("Browser is Set");

        }else {
            System.out.println("Not Allowed!!");
        }
    }

    void openBrowser(){
        System.out.println("Opening Browser!!");
    }

    void openBrowser(String browserName){
        System.out.println("opening Browser!!-> "+browserName);
    }

    void closeBrowser(){
        System.out.println("Close Browser!!");
    }
}
