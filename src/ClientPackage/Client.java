package src.ClientPackage;
import src.LibraryPackage.*;

public class Client {

    //private attributes of the client's information
    private String clientID;
    private String name;
    private long phoneNum;
    private String email;

    private static int clientCount = 0;

    // array to store client's leased items
    private Item[] leasedItems = new Item[0];

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

    public static int getClientCount()
    {
        return clientCount;
    }

    public static void setClientCount(int count)
    {
        clientCount = count;
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

     // array to store items leased by *all* clients
     public static Item[] allLeasedItems = new Item[0];
 
 
     // lease an item to the client
     // deepcopies original array and appends new item to the end
    // returns true or false based on success of adding item
     public boolean lease(Item item) {
         if (item == null) {
             return false;
         } else {
             int currentSize = this.leasedItems.length;
             Item[] newLeasedItems = new Item[currentSize + 1];
             for (int i = 0; i < currentSize; i++) {
                 newLeasedItems[i] = this.leasedItems[i];
             }
             newLeasedItems[currentSize] = item;
             this.leasedItems = newLeasedItems;
             return true;
         }
     }

    // allows client to return an item
    // deepcopy of original array minus returned item
    // checks if item exists and if item exists in the client's leased items array
    public boolean returns(Item item) {
        // check if item exists
        if (item == null) {
            return false;
        }

        // check if item exists in client's leased items array
        boolean itemExists = false;
        for (int i=0; i<this.leasedItems.length; i++) {
            if (this.leasedItems[i].equals(item)) {
                itemExists = true;
                break;
            }
        }

        if (itemExists) {
            int currentSize = this.leasedItems.length;
            Item[] newLeasedItems = new Item[currentSize=1];
            for (int i=0; i< currentSize; i++) {
                if (!this.leasedItems[i].equals(item)) {
                    newLeasedItems[i] = this.leasedItems[i];
                } else {
                    // "skips" over the removed item without having a null entry in the new array
                    currentSize -= 1;
                    i -= 1;
                }
            }
            this.leasedItems = newLeasedItems;
            return true;
        } else {
            return false;
        }
    }
 
     // static method that returns *all* leased items
     public static String allLeasedItems() {

         return "WIP";
     }

         
}
