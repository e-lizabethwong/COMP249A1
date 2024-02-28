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
        // TODO: delete and write a real main that isnt testing and full on meme-ing
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Elizabeth and Elsa's library!");
        System.out.println("Enter 1 if you would like to go to the menu or 2 if you would like to run a pre-defined scenario");

        int next = in.nextInt();

        if (next == 1)
        {

        }


        Client yoMAMA = new Client("yo mama", 1234423213, "feet4free@toes.com");
        System.out.println(yoMAMA.toString());

        Item notAnymore = new Item();
        System.out.println(notAnymore.toString() + notAnymore.getYearOfPub());

        Book innIt = new Book("smort", "smort guy", 2023, 88);
        System.out.println(innIt.toString() + innIt.getAuthor());

        // list in client that carries that client's rented items
        // static list in client that carries all rented items

        // list in item to keep track of all items created?
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
