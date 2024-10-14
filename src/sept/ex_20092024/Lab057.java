package sept.ex_20092024;

public class Lab057 {
    public static void main(String[] args) {
        //Max between two numbers
        int Tushar_salary=4;
        int prabhu_salary=7;

        String result= Tushar_salary>prabhu_salary ? "Tushar Salry is more":"Prabhu salary is more";
        System.out.println(result);

        int max=Tushar_salary>prabhu_salary ? Tushar_salary:prabhu_salary;
        System.out.println(max);

        int min=Tushar_salary<prabhu_salary ? Tushar_salary:prabhu_salary;
        System.out.println(min);


    }
}
