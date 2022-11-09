package class18;

public class Book {

    String bookName;
    String author;
    int chapter;

    public Book(String bookName, int chapter) {
        this.bookName = bookName;
        this.chapter = chapter;
        System.out.println("bookName = " + bookName +" chapter = "+chapter);
    }

    public Book(String author) {

        this.author = author;

        System.out.println("author = " + author);

    }

    public static void main(String[] args) {
        Book book1=new Book("Kite runner",4);
        Book bookAuthor=new Book("Khaled Hosseini");

    }
}
