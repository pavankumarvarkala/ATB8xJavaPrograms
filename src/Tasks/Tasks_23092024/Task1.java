package Tasks.Tasks_23092024;

public class Task1 {
    public static void main(String[] args) {
        int num1=45;
        int num2=20;
        String result="-";

        switch (result){
            case "+":
                System.out.println(num1+num2);
                break;

            case "-":
                System.out.println(num1-num2);
                break;

            case "*":
                System.out.println(num1*num2);
                break;

            case "/":
                System.out.println(num1/num2);
                break;

            case "%":
                System.out.println(num1%num2);
                break;

            default:
                System.out.println("No idea what it is");
                break;
        }

    }
}
