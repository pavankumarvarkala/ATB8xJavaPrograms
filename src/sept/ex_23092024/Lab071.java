package sept.ex_23092024;

public class Lab071 {
    public static void main(String[] args) {
        //Web Automation
        //I will ask user which browser you want to run
        //chrome->execute chrome
        //firefox->execute firefox
        //edge->execute edge
        String browser="chrome";
        switch (browser){
            case "chrome":
                System.out.println("Strating the chrome browser");
                break;

            case "firefox":
                System.out.println("Strating the firefox browser");
                break;

            case "edge":
                System.out.println("Strating the edge browser");
                break;

            default:
                System.out.println("No idea which browser is this");
                break;


        }
    }
}
