package Tasks.Tasks_25092024;

public class Task4 {
    public static void main(String[] args) {
        int vowels=0;
        int cons=0;
     String name="pramod";
        for (int i = 0; i <name.length() ; i++) {
            char A= name.charAt(i);
            if(A=='a' ||A=='e'||A=='i'||A=='o'||A=='u'){
                vowels++;
            }else{
                cons++;
            }
            
        }
        System.out.println("Vowels count is :"+vowels);
        System.out.println("Consonant count is :"+cons);
    }
}
