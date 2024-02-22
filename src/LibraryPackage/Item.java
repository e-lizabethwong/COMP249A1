package LibraryPackage;

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

    public Item(String name, String author, int yearOfPub) {
        this.name = name;
        this.author = author;
        this.yearOfPub = yearOfPub;
    }

    public Item(Item otherItem) {
        this(otherItem.name, otherItem.author, otherItem.yearOfPub);
    }
}
