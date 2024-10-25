package oct.ex_23102024.Exceptions;

public class Lab184_Custom_Exception {
    public static void main(String[] args) throws Exception {

        Bank sbi=new Bank("INR",100);
        Bank icici=new Bank("INR",123);
        Bank Jp_chase=new Bank("USD",100);
        System.out.println(sbi.add(icici));
//                bankName.amount+this.amount
        //        123+100=223;

        System.out.println(sbi.add(Jp_chase));


    }
}

