package Tasks.Tasks_23092024;

public class Task3 {
    public static void main(String[] args) {
        int a=2;
        String unit="f";
        switch (unit){
            default -> System.out.println("None");
            case "km"-> System.out.println(1000*a);
            case "f"-> System.out.println((a-32)*(5/9));
        }
    }
}
