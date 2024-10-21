package oct.ex_14102024_Abstraction.abstraction;

public class Lab154 {

}
interface I1{
    int age=10;

}
interface I2{}
class A{}
class B{}
class Test1 extends A{} //single inheritance
//class Test2 extends A,B{} //Multiple inheritance never possible.
class Test3 implements I1{}
class Test4 implements I1,I2{}
class Test5 extends A implements I1,I2{}
//class Test6 implements I1,I2 extends B{} not possible

