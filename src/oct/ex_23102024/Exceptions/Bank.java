package oct.ex_23102024.Exceptions;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency,Integer amount){
        this.currency=currency;
        this.amount=amount;
    }

    public String getCurrency(){
        return getCurrency();
    }

    public void setCurrency(String currency){
        this.currency=currency;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(){
        this.amount=amount;
    }

    public Integer add(Bank bankName) throws Exception {

        if (!bankName.currency.equalsIgnoreCase("INR")) {



//                throw new Exception("Currency Mismatch, can't give total");
//                throw new Exception("Currency Mismatch, can't give total");
                  throw new Error();

        }
        else {
            Integer sum = bankName.amount + this.amount;
            return sum;
        }

    }

}


