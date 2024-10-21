package oct.ex_14102024_Abstraction;

public class Lab148 {
    public static void main(String[] args) {
        ChromeTC c=new ChromeTC();
        c.openBrowser("Chrome");
        c.closeBrowser("Chrome");
        c.takeScreenshot();
        c.NoBodyKnowsWhereIamPresent();

        FirefoxTC f=new FirefoxTC();
        c.openBrowser("Firefox");
        c.closeBrowser("Firefox");
    }

}
