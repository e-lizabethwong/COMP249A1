package src.ClientPackage;
import src.LibraryPackage.*;

public class Client {

    //private attributes of the client's information
    private String clientID;
    private String name;
    private long phoneNum;
    private String email;
    private Item leasedItem;

    public static int clientCount = 0;

    // default constructor initializes attributes
    public Client() {
        this("", 0, "");
    }

    // parameterized constructor initializes attraibutes with given values, except for the ID which is automatically set 
    public Client(String name, long phoneNum, String email) {
        clientID = "C" + ++clientCount;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    // copy constructor
    public Client (Client otherClient) {
        this(otherClient.name, otherClient.phoneNum, otherClient.email);
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

    public void leaseItem(Item item) {
        this.leasedItem = item;
    }

    public void returnItem() {
        this.leasedItem = null;
    }

    public Item getLeasedItem() {
        return this.leasedItem;
    }

    public void showLeasedItem() {
        if (this.leasedItem != null) {
            System.out.println("Item leased by " + name + ": " + leasedItem);
        } else {
            System.out.println("No item leased by " + name);
        }
    }


     // array to store client's leased items
     public Item[] leasedItems = new Item[0];
     // array to store items leased by *all* clients
     public static Item[] allLeasedItems = new Item[0];
 
 
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
    
}
