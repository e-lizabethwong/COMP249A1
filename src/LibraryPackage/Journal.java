package src.LibraryPackage;

public class Journal extends Item {

    public int volumeNum = 0;
    // used for generating unique journal IDs
    public static int totalJournals = 1;

    // default constructor
    public Journal() {
        this("generic journal", "generic author", 69, 420);
    }

    // paramterized constructor
    public Journal(String name, String author, int yearOfPub, int volumeNum) {
        super(name, author, yearOfPub);
        this.volumeNum = volumeNum;
        this.id = "J" + totalJournals++;
    }

    // copy constructor
    public Journal(Journal otherJournal) {
        this(otherJournal.name, otherJournal.author, otherJournal.yearOfPub, otherJournal.volumeNum);
    }

    // getter and setter for name, auth, yearofpub are inherited from Item
    public int getVolumeNum() {
        return  this.volumeNum;
    }
    public void setVolumeNum(int volumeNum) {
        this.volumeNum = volumeNum;
    }
}
