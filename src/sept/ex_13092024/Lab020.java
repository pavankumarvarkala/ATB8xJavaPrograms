package sept.ex_13092024;

public class Lab020 {
    public static void main(String[] args) {
        //Literals

        //1.First Type-Boolean Values - true or false
        boolean is_married=true;
        boolean is_married1=false;

        //2.literal-integral type-Decimal system.
        int age=56;

        //Binary Literal
        int binary_num= 0b1010; //->10 in decimal system //Binary literal

        //octal Base Literal
        int octal=0101; //0101 = (0 × 8³) + (1 × 8²) + (0 × 8¹) + (1 × 8⁰) = 65

        //Hexadecimal literals
        int hex=0Xface; //base 16 - Colour combinations are in hexadecimal

        //3.Character Literals;
        //single Character
        char c1='A';
        char c2='B';
        char c3='@';

        //Escape Characters
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';
        System.out.println("pavan"+new_line+"kumar");
        System.out.println("pavan"+tab_line+"kumar");
        System.out.println("pavan"+back_space+"kumar");
        System.out.println("pavan"+carriage_return+"kumar");

        //ASCII
        char c11='A'; //65-ASCII
        char c12='\u1F60';
        System.out.println(c12); //ὠ :)




    }
}
