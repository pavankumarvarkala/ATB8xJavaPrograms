package oct.ex_14102024_Abstraction;

public class FirefoxTC extends BaseClass{
    @Override
    void openBrowser(String browser) {
        System.out.println("Open the Firefox");

    }

    @Override
    void closeBrowser(String browser) {
        System.out.println("Close the Firefox");
    }
}
