package Tasks.Tasks_25102024;

import java.util.Scanner;

public class Task2_Pyramid_Arrays_2D {
    public static void main(String[] args) {
        //✅ Pyramid pattern in Java
        //*
        //***
        //*****
        //*******
        //*********

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Pyramid Length(Rows):");
        int r= sc.nextInt();

        for (int i = 0; i <r ; i++) {
            for (int j = (i*2); j >=0 ; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
