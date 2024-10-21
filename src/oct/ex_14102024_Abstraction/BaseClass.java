package oct.ex_14102024_Abstraction;

public class BaseClass extends GrandBaseClass {
    //Web Automation
    //Single
    //Hide The Functionality of open and close browser
    void openBrowser(String browser){}
    void closeBrowser(String browser){}

    @Override
    void takeScreenshot() {
        System.out.println("Taking Screenshot");
    }
}
