//
// Assignment 1
// Question: 1
// Written by: Elizabeth Wong 40282463 & Elsa Rufenacht 40235345
//
//----------------------------------------------------------------
//
// this program does sht for a not programming library.
// TODO: edit .equals() to verify for null object and same object type

package src.DriverPackage;

import src.ClientPackage.*;
import src.LibraryPackage.*;

public class Driver {

    public static void main(String[] args) {
        // TODO: delete and write a real main that isnt testing and full on meme-ing
        Client yoMAMA = new Client("6942069", "yo mama", 1234423213, "feet4free@toes.com");
        System.out.println(yoMAMA.toString());

        Item notAnymore = new Item();
        System.out.println(notAnymore.toString() + notAnymore.getYearOfPub());

        Book innIt = new Book("smort", "smort guy", 2023, 88);
        System.out.println(innIt.toString() + innIt.getAuthor());

        // list in client that carries that client's rented items
        // static list in client that carries all rented items

        // list in item to keep track of all items created?
    }
}
