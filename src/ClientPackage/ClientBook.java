package src.ClientPackage;
import src.LibraryPackage.*;

// TODO: equals (and do i need accessor and mutator even???)

public class ClientBook {

    // array to store Clients
    Client[] clients = null;

    // default constructor
    public ClientBook() {
        this.clients = new Client[0];
    }

    // parameterized constructor
    public ClientBook(Client old) {

    }

    // copy constructor
    public ClientBook(ClientBook otherClientBook) {

    }

    // add a client
    public void add(Client client) {
        Client[] newClientBook = new Client[this.clients.length + 1];
        for (int i=0; i<this.clients.length+1; i++) {
            newClientBook[i] = this.clients[i];
        }
        newClientBook[this.clients.length] = client;
        this.clients = newClientBook;
    }

    // remove a client
    public void remove(Client client) {
        Client[] newClientBook = new Client[this.clients.length - 1];
        // place keeps track of where the loop is regarding newClientBook because remove shortens the array and i will
        // skip over a spot when the client item is "removed" (aka ignored and not added)
        int place = 0;
        for (int i=0; i<this.clients.length; i++) {
            if (!newClientBook[i].equals(client)) {
                newClientBook[++place] = this.clients[i];
            }
        }
        this.clients = newClientBook;
    }

    // toString
    @Override
    public String toString() {
        String strClients = "";
        for (int i=0; i<this.clients.length; i++) {
            strClients += this.clients.toString() + "\n";
        }
        return strClients;
    }
}
