package Tasks.Tasks18102024;

public class Task2 {
    public static void main(String[] args) {
        //Reverse the String without using the any functions. (for loop)
        String s="Pawan";
        String reverse="";

        for(int i=s.length()-1;i>=0;i--){

            reverse=reverse+s.charAt(i);

        }
        System.out.println(reverse);
    }
}
