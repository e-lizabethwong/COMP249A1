package src.ClientPackage;
import src.LibraryPackage.*;

public class Client {

    // variables for the client's information
    public String clientID = "";
    public String name = "";
    public long phoneNum = 0;
    public String email = "";

    // stores number of clients for ID
    public static int totalClients = 0;

    // array to store client's leased items
    public Item[] leasedItems = new Item[0];
    // array to store items leased by *all* clients
    public static Item[] allLeasedItems = new Item[0];

    // default constructor
    public Client() {
        this("bob ross", 514420696, "blabla@bla.ca");
    }

    // parameterized constructor
    public Client(String name, long phoneNum, String email) {
        this.clientID = "C" + totalClients;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    // copy constructor
    public Client (Client otherClient) {
        this(otherClient.name, otherClient.phoneNum, otherClient.email);
    }

    // lease an item to the client
    // deepcopies
    public void lease(Item item) {
        int currentSize = this.leasedItems.length;
        Item[] newLeasedItems = new Item[currentSize+1];
        for (int i=0; i<currentSize; i++) {
            newLeasedItems[i] = this.leasedItems[i];
        }
        newLeasedItems[currentSize] = item;
        this.leasedItems = newLeasedItems;
    }

    // static method that returns all leased items
    public static String allLeasedItems() {
        return "WIP";
    }

    //TODO: update this sheet to include leased items
    // toString
    @Override
    public String toString() {
        return "Client Profile --------------------------\n" +
                "Client ID: " + clientID + '\n' +
                "Name: " + name + '\n' +
                "Phone Number: " + phoneNum + '\n' +
                "email: " + email + '\n' +
                "----------------------------------------";
    }

    // equals
    @Override
    public boolean equals(Object otherObject)
    {
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
        Client otherClient = (Client) otherObject;
        return (this.name.equals(otherClient.name) && this.phoneNum == otherClient.phoneNum && this.email.equals(otherClient.email));
    }

    // getters and setters
    public String getClientID() {
        return clientID;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }
}
