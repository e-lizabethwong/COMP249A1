//
// Assignment 1
// Question: 1
// Written by: Elizabeth Wong 40282463 & Elsa Rufenacht 40235345
//
//----------------------------------------------------------------
//
// This program  manages all the items in a library like leases as well as returns to and from clients. The library has books, journals, and media.
// All items have an ID, a name, author(s), and year of publication. A client has an ID, name, phone number, and email address.


package src.DriverPackage;

import java.util.Scanner;
import src.ClientPackage.*;
import src.LibraryPackage.*;

public class Driver {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Elizabeth and Elsa's library!");
        System.out.println("Enter 1 if you would like to go to the menu or 2 if you would like to run a pre-defined scenario");

        int next = in.nextInt();

        if (next == 1)
        {
            do{
                System.out.println("---------------------------------------");
                System.out.println("Select a menu number to do an action:");
                System.out.println("1- add an item");
                System.out.println("2- delete an item");
                System.out.println("3- change information of an item");
                System.out.println("4- list all items in a specific category(book, hournal, media)");
                System.out.println("5- print all items from all categories");
                System.out.println();
                System.out.println("6- add a client");
                System.out.println("7- edit a client");
                System.out.println("8- delete a client");
                System.out.println("9- show all items leased by a client");
                System.out.println("9- show all leased items by all clients");
                System.out.println("10- display the biggest book");
                System.out.println("11- make a copy of the books array");

                int menu = in.nextInt();

                Library library = new Library();
                
                switch (menu) {
                    case 1:
                    //first define item attributes 
                        System.out.print("Enter item name: ");
                        String name = in.nextLine();
                        System.out.print("Enter item author: ");
                        String author = in.nextLine();
                        System.out.print("Enter item year: ");
                        int year = in.nextInt();
        
                        System.out.print("Enter item type (Book/Journal/Media): ");
                        String category = in.nextLine();
        
                        if (category.equalsIgnoreCase("Book")) {
                            System.out.print("Enter number of pages: ");
                            int numPages = in.nextInt();
                            Item book1 = new  Book(name, author, year, numPages);
                            library.addItem(book1);
                        } else if (category.equalsIgnoreCase("Journal")) {
                            System.out.print("Enter volume number: ");
                            int volumeNumber = in.nextInt();
                            Item jounral1 = new Journal(name, author, year, volumeNumber);
                            library.addItem(jounral1);
                        } else if (category.equalsIgnoreCase("Media")) {
                            System.out.print("Enter media type: ");
                            String mediaType = in.nextLine();
                            Item media1 = new Media(name, author, year, mediaType);
                            library.addItem(media1);
                        } else {
                            System.out.println("Invalid item type!");
                            }
                        break;
                    case 2:
                            System.out.print("Enter ID of item to delete: ");
                            String id = in.nextLine();
                            library.deleteItem(id);
                            break;
                        case 3:
                            System.out.print("Enter ID of item to change: ");
                            id = in.nextLine();
                            System.out.print("Enter new name: ");
                            String newName = in.nextLine();
                            System.out.print("Enter new author: ");
                            String newAuthor = in.nextLine();
                            System.out.print("Enter new year: ");
                            int newYear = in.nextInt();
                            library.changeItemInfo(id, newName, newAuthor, newYear);
                            break;
                        case 4:
                            System.out.print("Enter category to list (Book/Journal/Media): ");
                            category = in.nextLine();
                            library.listItemsByCategory(category);
                            break;
                        case 5:
                            library.printAllItems();
                            break;
                        case 6:
                           //
                        default:
                            System.out.println("Invalid choice!");
                    }
                
                   
            

            
            }while(next>=1 || next <=11);

        }else if(next == 2)
        {
            //
        }
    }


    //method that finds the book with the highest number of pages
    public static Book getBiggestBook(Book[] arr)
    {
        Book highestNumPages = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i].getNumPages() > highestNumPages.getNumPages())
            {
                highestNumPages = arr[i];
            }
        }

        return highestNumPages;
    }

    //method that makes a deep copy of the array of an iteam such as book, journal, or media passed as parameter
    public static Item[] copyBooks(Item[] arr)
    {
        if(arr == null)
        {
           return null; 
        }
        Item[] deepCopy = new Item[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] instanceof Book)
            {
                deepCopy[i] = new Book((Book)arr[i]);
            }

            else if (arr[i] instanceof Journal)
            {
                deepCopy[i] = new Journal((Journal)arr[i]);
            }
            else if (arr[i] instanceof Media)
            {
                deepCopy[i] = new Media((Media)arr[i]);
            }
        }
        
        return deepCopy;
        
    }
}
