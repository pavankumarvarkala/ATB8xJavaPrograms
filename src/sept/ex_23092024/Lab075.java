package sept.ex_23092024;

public class Lab075 {
    public static void main(String[] args) {
        //JDK>13
        int itemcode=006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of them are electronics gadgets");
                break;

            case 004,006,007:
                System.out.println("this is Mech");
                break;

            default:
                System.out.println("None");
                break;
        }
    }
}
