package LibraryPackage;

public class Book extends Item {
    // used for generating unique book IDs
    public static int totalBooks = 0;

    public int numPages = 0;

    // default constructor
    public Book() {
        super("generic book", "generic author," 420, 69);
        this.id = "B" + totalBooks;
    }

    // parameterized constructor
    public Book(String name, String author, int yearOfPub, int numPages) {
        super(name, author, yearOfPub, numPages);
        this.id = "B" + totalBooks;
    }


    // copy constructor
    public Book(Book otherBook) {
        // ID isn't copied because assignment wants individual IDs
        this(otherBook.name, otherBook.author, otherBook.yearOfPub, otherBook.numPages);
    }

}
