package oct.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab190_Array_Functions {
    public static void main(String[] args) {

        int[] marks={51,100,91,87,90};
        //0,1,2,3,4
        System.out.println(marks.length);
        Arrays.sort(marks);

        for (int i = 0; i <=marks.length-1 ; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("----------------");

        int item=Arrays.binarySearch(marks,90);
        System.out.println(item);
    }
}
