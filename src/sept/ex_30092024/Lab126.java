package sept.ex_30092024;

import java.util.Scanner;

public class Lab126 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number\n");
        int n= sc.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(n + "x" + i + "=" + (n*i));
            i++;
        }
    }
}
