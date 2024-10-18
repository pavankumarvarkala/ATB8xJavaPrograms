package oct.ex_04102024.Constructors;

public class Dog {
    String name;
    int age;
    String breed;
    int legs;

    //Default Constructor
    Dog(){
        System.out.println("I am DC");
        System.out.println("God is Happy!");
    }

    //PC
    Dog(String breed){
        System.out.println("I am DC");
        this.breed=breed;
    }
    //PC
    Dog(String breed,String name,int age,int legs){
        System.out.println("I am PC");
        this.breed=breed;
        this.name=name;
        this.age=age;
        this.legs=legs;

    }



    void walk(){

    }

}
