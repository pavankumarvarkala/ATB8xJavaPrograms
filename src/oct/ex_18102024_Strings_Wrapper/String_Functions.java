package oct.ex_18102024_Strings_Wrapper;

public class String_Functions {
    public static void main(String[] args) {
        String str=" Hello World ";
        String str1="Pramod";

        //length of the string
        System.out.println("Length: "+str.length());
        System.out.println("Length: "+str1.length());

        //SubString
        System.out.println("Substring: "+str.substring(1,6));

        //Trim->Remove spaces from start and end
        System.out.println("Substring: "+str.trim());

        //Convert to Uppercase and lower case
        System.out.println("Uppercase: "+str.toUpperCase());
        System.out.println("Uppercase: "+str.toLowerCase());

        System.out.println(str.charAt(2));
        System.out.println(str.equals("Hello"));
        System.out.println(str.indexOf('H'));
        System.out.println(str.contains("l"));
        System.out.println(str.contains("r"));
        System.out.println(str.isEmpty());
        System.out.println(str.split(" "));

        String name="Pramod";
        String name2="PramoD";
        System.out.println(name.compareTo(name2));//32
        //CompareTo->0-both are same.
        //Return number-ASCII value diff of two strings
        //d-D ->100-62=32
        System.out.println(str.strip());






    }
}
