package src.LibraryPackage;

public class Journal extends Item {

    private int volumeNum;
    // used for generating unique journal IDs
    private static int totalJournals = 1;

    // default constructor
    public Journal() {
        this("", "", 0, 0);
    }

    // paramterized constructor
    public Journal(String name, String author, int yearOfPub, int volumeNum) {
        super(name, author, yearOfPub);
        this.volumeNum = volumeNum;
        super.setID("J" + totalJournals++);
    }

    // copy constructor
    public Journal(Journal otherJournal) {
        this(otherJournal.getName(), otherJournal.getAuthor(), otherJournal.getYearOfPub(), otherJournal.getVolumeNum());
    }

    // equals
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
         Journal otherJournal = (Journal) otherObject;
        return this.getName().equals(otherJournal.getName()) && this.getAuthor().equals(otherJournal.getAuthor()) &&
                this.getYearOfPub() == otherJournal.getYearOfPub() && this.volumeNum == otherJournal.volumeNum;
    }

    // toString
    @Override
    public String toString(){
        return "Journal ID: " + this.getID() +
                "\nJournal Name: " + this.getName() +
                "\nJournal Author: " + this.getAuthor() +
                "\nYear of Publication: " + this.getYearOfPub() +
                "\nVolume Number: " + this.volumeNum;
    }

    // getter and setter for name, auth, yearofpub are inherited from Item
    public int getVolumeNum() {
        return  this.volumeNum;
    }
    public void setVolumeNum(int volumeNum) {
        this.volumeNum = volumeNum;
    }
}
