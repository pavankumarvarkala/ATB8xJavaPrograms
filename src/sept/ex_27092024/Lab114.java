package sept.ex_27092024;

public class Lab114 {
    public static void main(String[] args) {
        //Do While loop
        //A,B,C->init,condition,incre/decre
        //First block of statement will be always executed first time.
        //While->init->condition->body(code)->increment/decrement
        //Do While->init->body(code)->condition->increment/decrement
        int a=0;
        do {
            System.out.println(a);
            a++;
        }while (a<=10);
    }
}
