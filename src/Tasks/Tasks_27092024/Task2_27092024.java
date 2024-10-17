package Tasks.Tasks_27092024;

public class Task2_27092024 {
    public static void main(String[] args) {
        int i=2;
        int count=0;
        do {
            if (i%2==0){
                System.out.println(i);
                count++;
            }
            i++;
        }while (count<=4);

    }
}
