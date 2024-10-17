package Tasks.Tasks_25092024;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d= %d",num,i,num*i);
            System.out.println();
        }

    }
}
