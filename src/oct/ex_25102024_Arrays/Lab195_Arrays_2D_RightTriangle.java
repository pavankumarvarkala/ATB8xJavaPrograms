package oct.ex_25102024_Arrays;

import java.util.Scanner;

public class Lab195_Arrays_2D_RightTriangle {
    public static void main(String[] args) {

        //*
        //**
        //***
        //****
        //*****
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number:");
        int n= sc.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}