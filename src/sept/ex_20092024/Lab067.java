package sept.ex_20092024;

public class Lab067 {
    public static void main(String[] args) {
        //Grade Calculator
        //Write a program that calculates and displays
        //the letter grade for a given numerical score(e.g. A,B,C,D or F)
        //based on the following grading scale
        // A:90-100
        // B:80-89
        // C:70-79
        // D:60-69
        // F:0-59

        int score=23;
        char Grade='F';

        if(score>=90 && score<=100){
            Grade='A';
        } else if (score>=80 && score<=89) {
            Grade='B';

        } else if (score>=70 && score<=79) {
            Grade='C';
        } else if (score>=60 && score<=69) {
            Grade='D';

        } else if (score<=0 && score>100) {
            System.out.println("LOL!!, are you God?");
        }else {
            System.out.println(Grade);
        }
        System.out.println("Your Grade is -> "+Grade);

    }

}
