package oct.ex_16102024_Static_Keyword;

public class Lab158 {
    public static void main(String[] args) {
        ATB s1=new ATB("Pawan");
        ATB s2=new ATB("kumar");
        ATB s3=new ATB("Shiva");
        ATB s4=new ATB("Teja");
        ATB s5;
        new ATB("Pavan");
        s1.readDocuments();
        s2.readDocuments();
        ATB.doAssignement();

    }
}

class ATB{
    {
        System.out.println("IIB");
        //The purpose of IIB is Here we can write code related to
        //like Start a website or anything before starting the web/API automation.

        System.out.println("Reading from CSV File");
    }

    static {
        System.out.println("Load the class, I will execute");
    }

    private String name;
    private String Phone;
    static String couser_name="ATB8X";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }

    void readDocuments(){
        System.out.println("Non-Static Method");
        System.out.println(couser_name);//Normal functions can have static variables
    }

    static void doAssignement(){
//        System.out.println(phone);//static functions can't have instance variables in them
        System.out.println("Do Assignment");
    }
    static class GenAI{
        //0.0001% in Automation
    }
}


