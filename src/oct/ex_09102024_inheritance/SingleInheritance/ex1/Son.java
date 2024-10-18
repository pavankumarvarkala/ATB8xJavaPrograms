package oct.ex_09102024_inheritance.SingleInheritance.ex1;

public class Son extends Father {
    //Son->Father
    void bhk3(){
        System.out.println("3bhk");

        //Atrribute of father
        System.out.println(gold_f);
        //Behaviour of Father
        bhk2();
    }
}
