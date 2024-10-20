package oct.ex_11102024_Encapsulation.real;

public class Lab141 {
    public static void main(String[] args) {
        ICICIBank iciciBank=new ICICIBank("pawan",20000);

//        iciciBank.setBal(1000000);
        //This should allowed only to Admin

        //write a code to connect with mySQL
        //Admin
        boolean isAdmin=true;
        ICICIBank pawan=new ICICIBank("Admin",1000);
        pawan.setBal(5000,true);
        System.out.println(pawan.getName(true));
    }
}
