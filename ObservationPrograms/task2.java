
class book {
    private int bookid;
    private String bookname;
    private String author;
    private double price;

    public book(int id, String name, String author, double price) {
        this.bookid = id;
        this.bookname = name;
        this.author = author;
        this.price = price;
    }

    void setBookId(int id) {
        bookid = id;
    }

    void setBookName(String name) {
        bookname = name;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(double price) {
        this.price = price;
    }

    int getBookId() {
        return bookid;
    }

    String getBookName() {
        return bookname;
    }

    String getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }
}

public class task2 {
    public static void main(String[] args) {
        book c = new book(244, "Java", "James Gosling", 500);

        System.out.println("Book id is " + c.getBookId());
        System.out.println("Bookname is " + c.getBookName());
        System.out.println("Author is " + c.getAuthor());
        System.out.println("Price is " + c.getPrice());
    }
}