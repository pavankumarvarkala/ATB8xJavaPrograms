package oct.ex_16102024_Static_Keyword;

public class Lab159 {
    public static void main(String[] args) {
        //ENUM:
        //Short from of enumerations, a special data type in java.
        //allows to define a collection of named constants.
        System.out.println(Day.SATURDAY);

    }
    enum Day{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
    }
}
