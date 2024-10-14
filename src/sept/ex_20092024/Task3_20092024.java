package sept.ex_20092024;

public class Task3_20092024 {
    public static void main(String[] args) {
//         Write a program that classifies a triangle based on its side lengths.
//
// Given three input values representing the lengths of the sides, determine
//
// if the triangle is equilateral (all sides are equal),
//
// isosceles (exactly two sides are equal), or
//
// scalene (no sides are equal).
//
// Use an if-else statement to classify the triangle.
//
// side1, side2, side3 ->
        int side1=30,side2=30,side3=30;
        if(side1==side2 && side1==side3){
            System.out.println("Equilateral Triangle");
        } else if (side1==side2||side1==side3||side2==side3) {
            System.out.println("Isosceles Triangle");

        }else {
            System.out.println("Scalene Triangle");
        }
    }
}
