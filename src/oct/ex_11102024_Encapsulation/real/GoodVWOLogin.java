package oct.ex_11102024_Encapsulation.real;

public class GoodVWOLogin {
    private String username;
    private String password;

    public GoodVWOLogin(String username,String password){
        this.username=username;
        this.password=password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password,boolean IsAdmin) {
        if(IsAdmin){
            this.password = password;
        }else {
            System.out.println("Not Allowed!!!");
        }

    }
}
