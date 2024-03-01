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
                System.out.println("10- show all leased items by all clients");
                System.out.println("11- display the biggest book");
                System.out.println("12- make a copy of the books array");

                int menu = in.nextInt();

                if (menu == 1)
                {
                    System.out.println("What kind of item is it? B, J, M");
                    if (in.next().equalsIgnoreCase("b"))
                    {
                        System.out.println("Enter name:");
                        String name = in.nextLine();
                        System.out.println("Enter author:");
                        String author = in.nextLine();
                        System.out.println("Enter year of publication:");
                        int yr = in.nextInt();
                        System.out.println("Enter number of pages:");
                        int numPages = in.nextInt();

                        Item b = new Book(name, author, yr, numPages);
                    }
                    if (in.next().equalsIgnoreCase("j"))
                    {
                        System.out.println("Enter name:");
                        String name = in.nextLine();
                        System.out.println("Enter author:");
                        String author = in.nextLine();
                        System.out.println("Enter year of publication:");
                        int yr = in.nextInt();
                        System.out.println("Enter volume number:");
                        int numVol = in.nextInt();

                        Item j = new Journal(name, author, yr, numVol);
                    }
                    if (in.next().equalsIgnoreCase("m"))
                    {
                        System.out.println("Enter name:");
                        String name = in.nextLine();
                        System.out.println("Enter author:");
                        String author = in.nextLine();
                        System.out.println("Enter year of publication:");
                        int yr = in.nextInt();
                        System.out.println("Enter type:");
                        String type = in.nextLine();

                        Item m = new Media(name, author, yr, type);
                    }
                }
                if (menu ==2)
                {

                }
                if (menu == 3)
                {
                    System.out.println("Which information would you like to change?");
                }
            

            
            }while(next<1 || next >11);
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
