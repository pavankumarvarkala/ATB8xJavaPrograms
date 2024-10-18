package oct.ex_04102024.Constructors;

public class Lab130 {
    public static void main(String[] args) {
        Dog gs=new Dog("GS");
        System.out.println(gs.breed);

        Dog bd=new Dog("BD");
        System.out.println(bd.breed);
        System.out.println(bd.name);
        System.out.println(bd.age);
        System.out.println(bd.legs);


        Dog gs1=new Dog("GS","AA",1,4);
        System.out.println(gs1.name);
        System.out.println(gs1.age);
        System.out.println(gs1.legs);

    }


}
