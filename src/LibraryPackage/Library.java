package src.LibraryPackage;
import java.util.Scanner;

import src.ClientPackage.Client;

public class Library 
{
    private Item[] allItems = new Item[100];
    private static int itemCount = 0;
    // array to store Clients
    private Client[] clients = new Client[0];
    
    public void addItem(Item item)
    {
        allItems[itemCount++] = item;

    }

    public void deleteItem(String id)
    {
        for (int i = 0; i < itemCount; i++) {
            if (allItems[i].getID().equals(id)) {
                allItems[i] = null;
                for (int j = i; j < itemCount - 1; j++) {
                    allItems[j] = allItems[j + 1];
                }
                itemCount--;
                break;
            }
        }
    }

    public void changeItemInfo(String id, String newName, String newAuthor, int newYear) {
        for (int i = 0; i < itemCount; i++) {
            if (allItems[i].getID().equals(id)) {
                allItems[i].setName(newName); 
                allItems[i].setAuthor(newAuthor); 
                allItems[i].setYearOfPub(newYear);
                break;
            }
        }
    }

    public void listItemsByCategory(String category) {
        for (int i = 0; i < itemCount; i++) {
            if (allItems[i].getClass().getSimpleName().equalsIgnoreCase(category)) {
                System.out.println(allItems[i]);
            }
        }
    }

    public void printAllItems() {
        for (int i = 0; i < itemCount; i++) {
            System.out.println(allItems[i]);
        }
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


    public void deleteClient(String id) {
        for (int i = 0; i < Client.getClientCount(); i++) {
            if (clients[i].getClientID().equals(id)) {
                clients[i] = null;
                for (int j = i; j < Client.getClientCount() - 1; j++) {
                    clients[j] = clients[j + 1];
                }
                Client.setClientCount((Client.getClientCount())-1);
                System.out.println("Client deleted successfully!");
                
            }
        }
    
    }

    //edit client info based on given id number search 
    public void editClient(String id, String newname, long phone, String email) {
        for (int i = 0;i < this.clients.length;i++)
        {
            if(this.clients[i].getClientID().equals(id))
            {
                this.clients[i].setName(newname);
                this.clients[i].setPhoneNum(phone);
                this.clients[i].setEmail(email);

                System.out.println("Client information updated successfully!");

            }
        }
    }

    // iterates through all items to find the first book and then compares all books thereafter to find the biggest one
    public Book getBiggestBook() {
        Book biggestBook = null;
        boolean firstBook = true;
        for (int i=0; i<allItems.length; i++) {
            if (allItems[i].getClass() == Book.class) {
                if (firstBook) {
                    biggestBook = (Book) allItems[i];
                    firstBook = false;
                }
                if (((Book) allItems[i]).getNumPages() > biggestBook.getNumPages()) {
                    biggestBook = (Book) allItems[i];
                }
            }
        }
        return biggestBook;
    }

    public void allLeasedItems() {
        for (int i=0; i< clients.length; i++) {
            this.clients[i].printLeasedItems();
        }
    }
}
