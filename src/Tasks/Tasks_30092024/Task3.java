package Tasks.Tasks_30092024;

public class Task3 {
    public static void main(String[] args) {
        //Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
        String name="pramod";
        int vowels=0;
        int consonants=0;
        for (int i=0;i<name.length();i++){
            char A=name.charAt(i);
            if (A=='a'||A=='e' ||A=='i'||A=='o'||A=='u'){
                vowels++;
            }else{
                consonants++;
            }

        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
