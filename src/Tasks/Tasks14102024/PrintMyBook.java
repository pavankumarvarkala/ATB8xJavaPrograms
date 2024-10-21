package Tasks.Tasks14102024;

class PrintMyBook extends Book implements Book1{


    PrintMyBook(String name,String author,int price){
        this.name=name;
        this.author=author;
        this.price=price;
    }


    @Override
    void getDetails() {
        System.out.println(name +","+author+","+price);
    }

    @Override
    public void getDetails1() {
        System.out.println(name +","+author+","+price);
    }
}
