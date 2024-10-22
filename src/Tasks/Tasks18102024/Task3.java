package Tasks.Tasks18102024;

public class Task3 {
    public static void main(String[] args) {
        //Palindrome
        //Input : str = "abba"
        //Output: Yes

        String str="abba";
        String str2="Pramod";
        String str1="";
        for(int i=str.length()-1;i>=0;i--){
            str1=str1+str.charAt(i);
        }
        if(str.equals(str1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        for(int i=str2.length()-1;i>=0;i--){
            str1=str1+str2.charAt(i);
        }
        if(str2.equals(str1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
