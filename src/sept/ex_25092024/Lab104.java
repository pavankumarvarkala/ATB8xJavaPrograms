package sept.ex_25092024;

public class Lab104 {
    public static void main(String[] args) {
        for (int i = 0; i <10; i++) {//0 to 9
            System.out.println(i);
            if (i==5){
                continue;//skip current iteration
            }
            System.out.println("After");
            
        }
    }
}
