package oct.ex_23102024.Exceptions;

public class Lab186_Try {
    public static void main(String[] args) throws Exception {

        try {
            int c=10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
