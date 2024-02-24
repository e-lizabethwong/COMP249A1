package src.ClientPackage;

public class Client {

    public String clientID = "";
    public String name = "";
    public long phoneNum = 0;
    public String email = "";

    // default constructor
    public Client() {
        this("dawgski69420", "bob ross", 514420696, "blabla@bla.ca");
    }

    // paramaterized constructor
    public Client(String clientID, String name, long phoneNum, String email) {
        this.clientID = clientID;
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    // copy constructor
    public Client (Client otherClient) {
        this(otherClient.clientID, otherClient.name, otherClient.phoneNum, otherClient.email);
    }

    // static method that returns all leased items
    public static String allLeasedItems() {
        return "WIP";
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
