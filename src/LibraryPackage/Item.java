package src.LibraryPackage;

// super class for all library items
public class Item {
    public String id = "";
    public String name = "";
    public String author = "";
    public int yearOfPub = 0;

    // default constructor
    public Item() {
        this.id = "I" + 0;
        this.name = "generic item";
        this.author = "generic author";
        this.yearOfPub = 69420;
    }

    // parameter constructor
    public Item(String name, String author, int yearOfPub) {
        this.name = name;
        this.author = author;
        this.yearOfPub = yearOfPub;
        this.id = "I" + 420;
    }

    // copy constructor
    // bro idek why we have to make a copy constructor here we're never gonna use it
    public Item(Item otherItem) {
        // doesnt copy ID because it's individ for each item +
        this(otherItem.name, otherItem.author, otherItem.yearOfPub);
        this.id = "I" + 69;
    }

    // getter and setter for name, author, and yearOfPub so it can be inherited by Book, Journal, and Media
    // getters
    public String getName() {
        return this.name;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getYearOfPub() {
        return this.yearOfPub;
    }
    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setYearOfPub(int yearOfPub) {
        this.yearOfPub = yearOfPub;
    }
}
