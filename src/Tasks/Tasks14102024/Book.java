package Tasks.Tasks14102024;

abstract class Book {
//    Book class which has an abstract method getDetails(),name, author, price.
//
//    PrintMyBook class that inherits from the Book class.
//
//    abstract
//
//    Book myBook = new PrintMyBook("Harry Potter", "J.k. Rowling", "120");
//
//// Output
//
//"Harry Potter, J.k. Rowling, 100"
    protected String name;
   protected String author;
    protected int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    abstract void getDetails();
}
//interface Book1{
//    abstract void getDetails1();
//}



