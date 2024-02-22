package LibraryPackage;

public class Book extends Item {
    // used for generating unique book IDs
    public static int totalBooks = 0;

    public int numPages = 0;

    // default constructor
    public Book() {
        this.id = "B" + totalBooks;
        this.name = "generic book";
        this.author = "generic author";
        this.yearOfPub = 420;
        this.numPages = 69;
    }

    // parameterized constructor
    public Book(String name, String author, int yearOfPub, int numPages) {
        this.id = "B" + totalBooks;
        this.name = name;
        this.author = author;
        this.yearOfPub = yearOfPub;
        this.numPages = numPages;
    }


    // copy constructor
    public Book(Book otherBook) {
        // ID isn't copied because assignment wants individual IDs
        this(otherBook.name, otherBook.author, otherBook.yearOfPub, otherBook.numPages);
    }

}
