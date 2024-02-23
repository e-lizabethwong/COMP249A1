package src.LibraryPackage;

public class Media extends Item {

    // media type can be saved as audio / video / interactive
    public String type = "";
    // used for generating unique media IDs
    public int totalMedia = 1;

    // default constructor
    public Media() {
        this("generic media", "generic author", 42069, "vid");
    }

    // parameterized constructor
    public Media(String name, String author, int yearOfPub, String type) {
        super(name, author, yearOfPub);
        this.type = type;
        this.id = "M" + totalMedia++;
    }

    // copy constructor
    public Media (Media otherMedia) {
        // ID isnt copied because each new copy has a unique ID
        this(otherMedia.name, otherMedia.author, otherMedia.yearOfPub, otherMedia.type);
    }

    // getter and setter for name, auth, yearofpub are inherited from Item
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
