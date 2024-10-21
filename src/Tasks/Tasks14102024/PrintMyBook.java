package Tasks.Tasks14102024;

class PrintMyBook extends Book{


    public PrintMyBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }
}
