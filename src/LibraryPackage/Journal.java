package LibraryPackage;

public class Journal extends Item {

    public int volumeNum = 0;
    public static int totalJournals 0;

    public Journal() {
        super("generic journal", "generic author", 69);
        this.id = "J" + totalJournals;
    }

    public Journal(String name, String author, int yearOfPub) {
        super(name, author, yearOfPub);
        this.id = "J" + totalJournals;
    }

    public Journal(Journal otherJournal) {
        super(otherJournal.name, otherJournal.author, otherJournal.yearOfPub)'
        this.id = "J" + totalJournals;
    }
}
