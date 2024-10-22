package Tasks.Tasks18102024;

public class Task1 {
    public static void main(String[] args) {
        //Calculate the length of the String - without using the length() function.
        // String name =”Pramod”; →  6 , CharArray, for loop

        String name="Pramod";
        int length1=0;
        for(char c:name.toCharArray()){
            length1++;
        }
        System.out.println(length1);

        int length=0;
        for (int i = 0; i <name.length(); i++) {
            length++;

        }
        System.out.println(length);
    }
}
