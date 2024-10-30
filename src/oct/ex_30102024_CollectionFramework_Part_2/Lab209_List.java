package oct.ex_30102024_CollectionFramework_Part_2;

import java.util.ArrayList;
import java.util.List;

public class Lab209_List {
    public static void main(String[] args) {

        student s1=new student("pawan",1);
        student s2=new student("Teja",2);
        student s3=new student("Shiva",3);

        List<student> myStudents=new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        System.out.println(s1.PrintDetails());
        System.out.println(s2.PrintDetails());
        System.out.println(s3.PrintDetails());
        System.out.println("-------------------");
        System.out.println(myStudents);
    }

}
class student{
    String name;
    Integer rollNo;

    public student(String name,Integer rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }

    public String getname(){
        return name;
    }

    public void setname(String name){
        this.name=name;
    }

    public Integer getrollno(){
        return rollNo;
    }
    public void setrollno(Integer rollNo){
        this.rollNo=rollNo;
    }


    public String PrintDetails() {
        return "student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}