package oct.ex_09102024_inheritance.SingleInheritance.ex2;

public class Python extends Programming{
    //Is A Programming Language
    Python(){
        System.out.println("DC");
    }

    void print(){
        System.out.println(author);
        System.out.println(version);
    }
}
