package oct.ex_11102024_Encapsulation.accessModifiers.police;

public class Cop {
    private int gun;
    private String idCard;

    public Cop(int gun){
        this.gun=gun;
    }

    protected void canIShoot(){
        System.out.println("Yes, You can!!");
    }
}
