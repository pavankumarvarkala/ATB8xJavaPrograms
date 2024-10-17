package Tasks.Tasks_30092024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        //        // n = 1 ->  Fact = 1*1 -> 1
        //        // n = 3 -> Fact = 3*2*1 -> 6
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number\n");
        int n= sc.nextInt();
        int factorial=1;

        while (n>=1){
            factorial=factorial*n;
            n--;

        }
        System.out.println(factorial);
    }
}
