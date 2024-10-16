package sept.ex_25092024.Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Factorial of given number

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int i=sc.nextInt();
        int factorial=1;

        //for loop

        for (; i >0 ; i--) {
            factorial=factorial*i;

        }
        System.out.println("factorial of given number is : "+factorial);

        //while loop
        System.out.println("Enter the number ");
        int i1=sc.nextInt();

        factorial=1;
        while (i1>0){
            factorial=factorial*i1;
            i1--;
        }
        System.out.println("factorial of given number is : "+factorial);


    }
}
