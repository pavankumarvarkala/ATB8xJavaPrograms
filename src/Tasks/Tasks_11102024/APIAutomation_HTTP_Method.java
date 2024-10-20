package Tasks.Tasks_11102024;

public class APIAutomation_HTTP_Method {
    public static void main(String[] args) {

        BaseTestAPI b=new TestCaseAPI();//Dynamic Dispatch
        b.performGET();
        b.performGET("get");
        System.out.println(b.name);
        b.performPOST();
        b.performPATCH(404);
        System.out.println(b.id);
        b.performDELETE();

    }
}
