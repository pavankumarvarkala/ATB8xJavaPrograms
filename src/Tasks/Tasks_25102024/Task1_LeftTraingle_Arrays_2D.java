package Tasks.Tasks_25102024;

import java.util.Scanner;

public class Task1_LeftTraingle_Arrays_2D {
    public static void main(String[] args) {
//        ✅ Left Triangle Star Pattern
//        *****
//        ****
//        ***
//        **
//        *


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n=sc.nextInt();

        for (int i = n; n >0 ; n--) {
            for (int j = 0; j <n ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
