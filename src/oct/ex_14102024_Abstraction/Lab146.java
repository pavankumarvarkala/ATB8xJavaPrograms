package oct.ex_14102024_Abstraction;

public class Lab146 {
    //Encapsulation:
    //1.Hiding important instance variables by using methods
    //2.By using Getter,Setter or making them private(Access modifiers)-Hiding data(data members)
    //3.with in class

    //Abstraction:
    //1.Hiding the implementation
    //2.Hiding the complete class(with data members+ methods)
    //3.By using Abstract is the keyword or Interface.

    //Abstract Class
    //1.Abstract is Keyword.
    //2.Abstract can be class or method.
    //3.Abstract->incomplete
    //4.if the class doesn't have any Abstract method,then it is Concrete class.
    //5.An Abstract class can not be final.
    //6.An Abstract Class can not be initiated that is one can not create an object of Abstract class.
    //7.You can not use the following modifier with abstract methods:
    //->Private,static,final,native,strictfp,synchronized,native.

}
//Concrete Class
class person{}
class student1{}
class student2{}
class student3{}

//Abstract Class
abstract class Loan{
    abstract void Loan50k();
    void Loan1L(){
        System.out.println("1L Loan is there");
    };
}



