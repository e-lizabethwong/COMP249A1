package src.ClientPackage;

public class Client {

    public String clientID = "";
    public String name = "";
    public long phoneNum = 0;
    public String email = "";

    public Client() {
        this("dawgski69420", "bob ross", 514420696, "blabla@bla.ca");
    }

    public Client(String clientID, String name, long phoneNum, String email) {
        this.clientID = clientID;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public Client (Client otherClient) {
        this(otherClient.clientID, otherClient.name, otherClient.phoneNum, otherClient.email);
    }

    // static method that returns all leased items
    public static String allLeasedItems() {
        return "WIP";
    }
}
