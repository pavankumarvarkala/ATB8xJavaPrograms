package sept.ex_20092024;

public class Task2_20092024 {
    public static void main(String[] args) {
        //2.Ternary Operators to handle multiple conditions.
        // Input → int score = 85

        // String grade →

        //  score >= 90 → A
        //  score >= 80 → B
        //  score >= 70 → C
        int score=85;
        String grade=(score>=90)? "A":(score>=80 && score<=89) ?"B":(score>=80 && score<=89)?"C":"Fail";
        System.out.println("grade is ->"+grade);
    }
}
