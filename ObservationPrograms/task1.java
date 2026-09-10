class Book
{
    int bookid;
    String bookname;
    String author;
    double price;

    void display()
    {
        System.out.println("Book id name=" + bookid);
        System.out.println("Book name is " + bookname);
        System.out.println("Author name " + author);
        System.out.println("price is " + price);
    }
}

public class task1
{
    public static void main(String[] args)
    {
        Book b = new Book();

        b.bookname = "Java Learning";
        b.bookid = 244;
        b.author = "James Glasling";
        b.price = 450.00;

        Book m = new Book();

        m.bookid = 28;
        m.bookname = "Mahavatar";
        m.author = "Krishna";
        m.price = 435.00;

        b.display();
        m.display();
    }
}