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
    public Media(Media otherMedia) {
        this(otherMedia.name, otherMedia.author, otherMedia.yearOfPub, otherMedia.type);
    }

    // equals
    public boolean equals(Media otherMedia) {
        return this.name.equals(otherMedia.name) && this.author.equals(otherMedia.author) &&
                this.yearOfPub == otherMedia.yearOfPub && this.type.equals(otherMedia.type);
    }

    // toString
    @Override
    public String toString(){
        return "Media ID: " + this.id +
                "\nMedia Name: " + this.name +
                "\nMedia Author: " + this.author +
                "\nJournal of Publication: " + this.yearOfPub +
                "\nMedia Type: " + this.type;
    }


    // getter and setter for name, auth, yearofpub are inherited from Item
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
