package sept.ex_23092024;

public class Lab068 {
    public static void main(String[] args) {
        //switch Statement
        //byte,short,int,long(with its wrapper type),enum and String
        //switch(expression){
        //case statement 1:
        //code
        //break;
        //case statement 2:
        //code
        //break;
        //default statement 3: (optional)
        //code
        //break;(optional)
        //
        // }
        //day 1-7 -> 1->mon, 2->tue.....7->sun
        int day=1;
        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("No idea, what day it is");
                break;
        }
        System.out.println("End of the Loop");

    }
}
