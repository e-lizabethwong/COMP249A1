package src.LibraryPackage;

public class Media extends Item {

    // media type can be saved as audio / video / interactive
    private String type;
    // used for generating unique media IDs
    private static int totalMedia = 1;

    // default constructor
    public Media() {
        this("", "", 0, "");
    }

    // parameterized constructor
    public Media(String name, String author, int yearOfPub, String type) {
        super(name, author, yearOfPub);
        this.type = type;
        super.setID("M" + totalMedia++);
    }

    // copy constructor
    public Media(Media otherMedia) {
        this(otherMedia.getName(), otherMedia.getAuthor(), otherMedia.getYearOfPub(), otherMedia.type);
    }

    // equals
    public boolean equals(Media otherObject) {
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
         Media otherMedia = (Media) otherObject;
        return this.getName().equals(otherMedia.getName()) && this.getAuthor().equals(otherMedia.getAuthor()) &&
                this.getYearOfPub() == otherMedia.getYearOfPub() && this.type.equals(otherMedia.type);
    }

    // toString
    @Override
    public String toString(){
        return "Media ID: " + this.getID() +
                "\nMedia Name: " + this.getName() +
                "\nMedia Author: " + this.getAuthor() +
                "\nJournal of Publication: " + this.getYearOfPub() +
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
