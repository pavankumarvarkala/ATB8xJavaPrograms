package Tasks.Tasks_11102024;

public class BaseTestAPI {
    protected String name;
    protected int id;

    BaseTestAPI(){
        System.out.println("DC BaseTest");
    }

    BaseTestAPI(int id){
        System.out.println("PC BaseTest");
    }

    void performGET(){
        System.out.println("Performing GET Request");

    }
    String performGET(String name){
        System.out.println("Performing GET Request");
        this.name=name;
        return name;

    }

    String performPOST(){
        System.out.println("Performing POST Request");
        return "Post";
    }

    void performPATCH(int id){
        System.out.println("Performing PATCH Request");
        this.id=id;

    }

    void performPUT(){
        System.out.println("Performing PUT Request");

    }

    void performDELETE(){
        System.out.println("Performing GET Request");

    }
}
