package sept.ex_27092024;

import java.util.Scanner;

public class Lab118 {
    public static void main(String[] args) {
        //Triangle Classifier
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of side1: ");
        double side1=sc.nextDouble();

        System.out.println("Enter the length of side2: ");
        double side2=sc.nextDouble();

        System.out.println("Enter the length of side3: ");
        double side3=sc.nextDouble();

        if(side1>=1 && side2>=1 && side3>=1) {
            if (side1 == side2 && side1 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {

                System.out.println("Isosceles Triangle");

            } else {
                System.out.println("Scalene Triangle");
            }
        }
        else {
            System.out.println("Are you Mad? , Negative sides");
        }
    }
}
