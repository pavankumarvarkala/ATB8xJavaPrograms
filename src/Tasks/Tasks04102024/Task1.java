package Tasks.Tasks04102024;

public class Task1 {
    public static void main(String[] args) {
        Person pawan=new Person();

        Person pavan=new Person();
        pavan.eat();
        pavan.sleep();
        pavan.walk("PAVAN");
        pavan.work();


        Person praveen=new Person();
        praveen.name="Praveen";
        System.out.println(praveen.name);

        Person shiva=new Person("Pawan",33,78,6,"Medium complexion");
        System.out.println(shiva.name);
        System.out.println(shiva.age);
        System.out.println(shiva.weight);
        System.out.println(shiva.height);
        System.out.println(shiva.colour);

        Person teja=new Person(true,"graduation","varkala",8,true,true);
        System.out.println(teja.is_married);
        System.out.println(teja.education);
        System.out.println(teja.surname);
        System.out.println(teja.salary);
        System.out.println(teja.does_have_vehicle);
        System.out.println(teja.does_have_own_house);
    }
}
