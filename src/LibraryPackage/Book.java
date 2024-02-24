package src.LibraryPackage;

public class Book extends Item {
    // used for generating unique book IDs
    public static int totalBooks = 1;
    public int numPages = 0;

    // default constructor
    public Book() {
        this("generic book", "generic author", 420, 69);
    }

    // parameterized constructor
    public Book(String name, String author, int yearOfPub, int numPages) {
        super(name, author, yearOfPub);
        this.id = "B" + totalBooks++;
        this.numPages = numPages;
    }

    // copy constructor
    public Book(Book otherBook) {
        // ID isn't copied because assignment wants individual IDs
        this(otherBook.name, otherBook.author, otherBook.yearOfPub, otherBook.numPages);
    }

    // equals method
    public boolean equals(Book otherBook) {
        return this.name.equals(otherBook.name) && this.author.equals(otherBook.author) &&
                (this.yearOfPub == otherBook.yearOfPub) && (this.numPages == otherBook.numPages);
    }

    // toString
    @Override
    public String toString(){
        return "Book ID: " + this.id +
                "\nBook Name: " + this.name +
                "\nBook Author: " + this.author +
                "\nYear of Publication: " + this.yearOfPub +
                "\nNumber of Pages: " + this.numPages;
    }

    // getter and setter for name, auth, yearofpub are inherited from Item
    public int getNumPages() {
        return numPages;
    }
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
