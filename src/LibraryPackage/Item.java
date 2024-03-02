package src.LibraryPackage;

// super class for all library items
public class Item {
    protected String id;
    protected String name;
    protected String author;
    protected int yearOfPub;

    // default constructor
    public Item() {
        this.name = "";
        this.author = "";
        this.yearOfPub = 0;
    }

    // parameterized constructor
    public Item(String name, String author, int yearOfPub) {
        this.name = name;
        this.author = author;
        this.yearOfPub = yearOfPub;
    }

    // copy constructor
    public Item(Item otherItem) {
        // doesnt copy ID because it's individ for each item +
        this(otherItem.name, otherItem.author, otherItem.yearOfPub);

    }

    // equals method
    @Override
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
         Item otherItem = (Item) otherObject;
        
        return this.name.equals(otherItem.name) && this.author.equals(otherItem.author) && (this.yearOfPub == otherItem.yearOfPub);
    }

    // toString
    @Override
    public String toString(){
        return "Item ID: " + this.id +
                "\nItem Name: " + this.name +
                "\nItem Author: " + this.author +
                "\nYear of Publication: " + this.yearOfPub;
    }

    // getter and setter for name, author, and yearOfPub so it can be inherited by Book, Journal, and Media
    // getters
    public String getID() {
        return this.id;
    }
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

    public void setID(String id)
    {
        this.id = id;
    }
}
