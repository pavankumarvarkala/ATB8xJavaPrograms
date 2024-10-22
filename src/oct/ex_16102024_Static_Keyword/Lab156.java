package oct.ex_16102024_Static_Keyword;

public class Lab156 {
    public static void main(String[] args) {
        student s1=new student(23);
        student s2=new student(25);
        System.out.println(s1.age);
        System.out.println(s2.age);
        student.school_name="Xyz";
        System.out.println(student.school_name);
    }

}
class student{
    int age;//instance variable(Non-static)
    static String school_name; //static variable

    {
        System.out.println("IIB");
        System.out.println("Here you can write a code what you want to do when a object is created");
        System.out.println("Read a MYSQL db");
    }

    static {
        System.out.println("SIB");
        System.out.println("Loaded Once,when class is loaded");
    }

    public student(int age) {
        this.age = age;
    }
}



