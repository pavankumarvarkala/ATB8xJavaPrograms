package sept.ex_18092024;

public class Lab051 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);//34 is output
        System.out.println(a); //13 is ouput
        //Part-> A-> ++a ,Exp1=11, a=11
        //Part-> B-> a++ ,Exp1=11, a=12
        //Part-> C-> a++ ,Exp1=12, a=13
    }
}
