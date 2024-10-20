package oct.ex_11102024_Encapsulation.real;

public class Lab140 {
    public static void main(String[] args) {
        VWOLogin vwoLogin=new VWOLogin("admin","password");
        System.out.println(vwoLogin.password);
        vwoLogin.password="hacker";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwoLogin1=new GoodVWOLogin("goodadmin","password");
//        System.out.println(vwoLogin1.password);

        System.out.println(vwoLogin1.getPassword());

        //Checking Admin
        boolean IsAdmin=false;

        vwoLogin1.setPassword("newpassword",IsAdmin);
        System.out.println(vwoLogin1.getPassword());
    }
}
