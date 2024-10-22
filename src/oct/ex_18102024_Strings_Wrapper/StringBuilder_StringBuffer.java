package oct.ex_18102024_Strings_Wrapper;

public class StringBuilder_StringBuffer {
    public static void main(String[] args) {
         //StringBuffer and StringBuilder will be used to create mutable strings
        //Efficient for String manipulation operation
        //such as appending,inserting or deleting characters from a string.
//        String name="Pramod";
//        name="Pawan";

        StringBuffer stringBuffer=new StringBuffer("Pawan");
        StringBuffer stringBuffer1=new StringBuffer("Shiva");
        stringBuffer.append(" Kumar");
        stringBuffer1.append(" Teja");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);

        //C1,C2->Toy
        //C1-2hrs and C2->2hrs->synchronous->Thread Safety->slow in nature.

        StringBuilder stringBuilder=new StringBuilder("Hello");

        //appending to string builder
        stringBuilder.append("World");
        System.out.println(stringBuilder);

        //Inserting into string builder
        stringBuilder.insert(5," ");
        System.out.println(stringBuilder);


        //Deleting from String builder
        stringBuilder.delete(5,6);
        System.out.println(stringBuilder);

        //Reversing StringBuilder
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
