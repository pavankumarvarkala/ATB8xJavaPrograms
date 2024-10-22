package oct.ex_18102024_Strings_Wrapper;

public class Lab162 {
    public static void main(String[] args) {
        //Strings->immutable in nature->its value can not be changed once created
        //->Any modification results in creation of new string.
        char c='A';
        String name="Pawan";//contains multiple chars.
        name="Varkala";

        //How Strings are created?
        //1.=operator-> String constant pool(JVM)
        String name1="Kumar";//example
        //2.new operator->Heap area->JVM Objects.
        String name2=new String("Teja");//example
        name2="Shiva";
        System.out.println(name2);

    }
}
