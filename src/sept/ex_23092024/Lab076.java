package sept.ex_23092024;

public class Lab076 {
    public static void main(String[] args) {
        int itemcode=001;
        switch (itemcode){
            case 001-> System.out.println("It's a Laptop!");
//            System.out.println("test");
            case 002-> System.out.println("It's a Desktop!");
            case 003,004-> System.out.println("It's a Mobile phone!");
            default-> System.out.println("Hello!");
        }
    }
}
