package sept.ex_18092024;

public class Lab041_TypeCasting {
    public static void main(String[] args) {
        //Type casting
        //widening -Implicit and Explicit -lossless
        //Narrowing-Implicit and Explicit(with data type),loss

        //Widening
        byte b=10;
        int a=b; //valid Implicit Casting-JVM
        int a1=(int)b; //valid Explicit Casting-JVM
        System.out.println(a);

        //Narrowing
        int val=300;
//        byte b1= val; //invalid Implicit Casting-JVM
        byte b2= (byte) val; //vali Explicit Casting-Loss of data
        System.out.println(b2);//output is 44
        //int val=300; ->int means 32 bits memory is required
        //00000000000000000000000100101100
        //byte b2=(byte)val->byte means 8bits memory is required
        //00101100
        //(0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) +
        // (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀

        int val1=200;
//        byte b1= val; //invalid Implicit Casting-JVM
        byte b3= (byte) val1; //vali Explicit Casting-Loss of data
        System.out.println(b3);

    }
}
