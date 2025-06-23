package a5_class;

public class Book {
    String title;
    String author;
    String price;

    public Book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String printBookInfo(){
        String info = this.title + ", by, " + this.author+", " + this.price;
        return info;
    }
}
