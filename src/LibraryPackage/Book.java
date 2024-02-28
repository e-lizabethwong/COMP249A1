package src.LibraryPackage;

import src.ClientPackage.Client;

public class Book extends Item {
    // used for generating unique book IDs
    private static int totalBooks = 1;
    private int numPages;

    // default constructor
    public Book() {
        this("", "", 0, 0);
    }

    // parameterized constructor
    public Book(String name, String author, int yearOfPub, int numPages) {
        super(name, author, yearOfPub);
        super.setID("B" + totalBooks++);
        this.numPages = numPages;
    }

    // copy constructor
    public Book(Book otherBook) {
        // ID isn't copied because assignment wants individual IDs
        this(otherBook.getName(), otherBook.getAuthor(), otherBook.getYearOfPub(), otherBook.numPages);
    }

    // equals method
    public boolean equals(Object otherObject) {
        //verify if passed object is null
        if (otherObject == null)
        {
            return false;
        }
        //verify if passed object is of a different type than the calling object
        if (this.getClass() != otherObject.getClass())
        {
            return false;
        }
        //compares equality of each attribute except for the ID
        Book otherBook = (Book) otherObject;
        return this.getName().equals(otherBook.getName()) && this.getAuthor().equals(otherBook.getAuthor()) &&
                (this.getYearOfPub() == otherBook.getYearOfPub()) && (this.numPages == otherBook.numPages);
    }

    // toString
    @Override
    public String toString(){
        return "Book ID: " + this.getID() +
                "\nBook Name: " + this.getName() +
                "\nBook Author: " + this.getAuthor() +
                "\nYear of Publication: " + this.getYearOfPub() +
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
