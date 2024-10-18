package oct.ex_04102024;

public class Lab128 {
    public static void main(String[] args) {

        AHuman pavan=new AHuman();
        AHuman kumar=new AHuman("Pawan");
        AHuman teja=new AHuman("Varkala");

        new AHuman();
//        pavan.name="PAVAN";
//        kumar.name="KUMAR";
        System.out.println(pavan.name);
        System.out.println(pavan.planet);
        System.out.println(kumar.planet);
        System.out.println(kumar.name);
        System.out.println(teja.name);

    }
}
