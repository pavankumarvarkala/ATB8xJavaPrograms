package Tasks.Tasks04102024;

public class Person {
    //Attributes
    String name;
    int age;
    int weight;
    int height;
    String colour;
    boolean is_married;
    String surname;
    String education;
    int salary;
    boolean does_have_vehicle;
    boolean does_have_own_house;

    //Behaviour/Methods

    //Default Constructor
    Person(){
        System.out.println("hi i am a person");

    }

    //Parameterized Constructor
    Person(String name,int age,int weight,int height,String colour){
        System.out.println("Hi, I am PC");
        this.age=age;
        this.name=name;
        this.weight=weight;
        this.height=height;
        this.colour=colour;
    }

    //Parameterized Constructor
    Person(boolean is_married,String education,String surname,int salary,boolean does_have_vehicle,boolean does_have_own_house){
        System.out.println("Hi, I am PC");
        this.education=education;
        this.is_married=is_married;
        this.surname=surname;
        this.salary=salary;
        this.does_have_own_house=does_have_own_house;
        this.does_have_vehicle=does_have_vehicle;
    }

    void eat(){
        System.out.println("NRNA");
        System.out.println("Eat");
    }

    String sleep(){
        System.out.println("RTNA");
        System.out.println("Sleep");
        return "Sleeping";
    }

    void walk(String name){
        System.out.println("NRWA");
        System.out.println("walk");
    }

    String work(){
        System.out.println("RTWA");
        System.out.println("work");
        return "Working";
    }





}
