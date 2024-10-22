package oct.ex_16102024_Static_Keyword;

public class Lab160_ENUM {
    public static void main(String[] args) {
        System.out.println(colour.RED.getHexcode());
        System.out.println(colour.GREEN.getHexcode());
        System.out.println(colour.BLUE.getHexcode());

        if(colour.GREEN.getHexcode()=="#61FF33"){
            System.out.println("Colour is Green");
        }
    }
}
enum colour{
    RED("#FF000"),
    GREEN("#61FF33"),
    BLUE("#3377FF");

    private String hexcode;

    private colour(String hexcode) {
        this.hexcode = hexcode;
    }

    public String getHexcode() {
        return this.hexcode;
    }
}

