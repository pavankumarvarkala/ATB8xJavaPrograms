package sept.ex_23092024;

public class Lab070 {
    public static void main(String[] args) {
        //switch statement
        //day 1-7 -> 1->mon, 2->tue.....7->sun
        int day=5;
        switch(day){
            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("Tue");

            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thu");

            case 5:
                System.out.println("Fri");

            case 6:
                System.out.println("Sat");

            case 7:
                System.out.println("Sun");
            default:
                System.out.println("No idea, what day it is");

        }
        System.out.println("End of the Loop");
    }
}
