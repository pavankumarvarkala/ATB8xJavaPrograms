package oct.ex_18102024_Strings_Wrapper;

public class String_Equals {
    public static void main(String[] args) {
        String s1="Hello";//String constant pool
        String s4="Hello";
        String s2=new String("Hello");
        String s3=new String("Hello");
        String s5=new String("hello");

        System.out.println(s1==s2);//false
        System.out.println(s2==s3);//false
        //== is checking reference locations incase of strings
        System.out.println(s1==s4);//true

        //How can i check the values
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
        //equals->Checks for value
    }
}
