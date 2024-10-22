package oct.ex_16102024_Static_Keyword;

public enum APIConstantsEndpoints {
    //Store the API Constants-END points
        BASE_URL("https://app.vwo.com"),
        LOGIN_PAGE("https://app.vwo.com/#/login"),
        DASHBOARD_PAGE("https://app.vwo.com/dasHboard");

        private  String name;
        APIConstantsEndpoints(String name){
            this.name=name;
        }
        String getValue(){
            return this.name;
        }

}
