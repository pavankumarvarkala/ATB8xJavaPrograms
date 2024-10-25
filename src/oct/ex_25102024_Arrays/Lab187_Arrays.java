package oct.ex_25102024_Arrays;

public class Lab187_Arrays {
    public static void main(String[] args) {
        //bread,paneer,milk,chai
        //Arrays->same data type
        //marks 10th-> 51,100,91,87,90
        int[] marks={51,100,91,87,90};
        System.out.println(marks.length);
        System.out.println(marks[0]);//Index-0
        System.out.println(marks[1]);//Index-1
        System.out.println(marks[2]);//Index-2
        System.out.println(marks[3]);//Index-3
        System.out.println(marks[4]);//Index-4
        try {
            System.out.println(marks[5]);//Index-5 //ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        int[] marks2=new int[5];//length is 5
        marks2[0]=10;
        marks2[1]=20;
        marks2[2]=30;
        marks2[3]=40;
        marks2[4]=50;
        System.out.println(marks2[0]);
        System.out.println(marks2[1]);
        System.out.println(marks2[2]);
        System.out.println(marks2[3]);
        System.out.println(marks2[4]);
    }
}
