package sept.ex_25092024;

public class Lab105 {
    public static void main(String[] args) {
        //print values of even and odd numbers from 0 to 50
        for (int i = 0; i <=50 ; i++) {
            if(i%2==0){
                System.out.println("Even -> "+i);
                continue;
            }
            System.out.println("Odd -> " +i);
        }
    }
}
