package oct.ex_04102024;

public class AHuman {
    String eyes;
    String planet="AHuman";
    String name;
    long aadhar_card_number;

    //Default Constructor
    AHuman(){

        System.out.println("I will be called, when object is created");
        //write a code here, which will be automatically called when object is created.
        //Read a File Txt
        //Read a CSV, Excel Here.
    }

    //Parameterized Constructor
    AHuman(String name){
        System.out.println("Hi, I am Parameterized Constructor ");
        this.name=name;
    }

    void walk(){

        System.out.println("NRNA");

    }

    int talk(){
        System.out.println("RTNA");
        return 10;

    }

    String sleep(String name){
        System.out.println("sleeping");
        System.out.println("RTWA");
        return "i am sleeping";
    }

    void eat(String name){
        System.out.println("Eat");
        System.out.println("NRWA");

    }



}
