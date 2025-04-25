package virtuallibrary;

/*
 * Project: Virtual Library
 * Author: Jared Sanders
 * Date: April 25, 2025
 * Description: This class manages the collection of books and users in the virtual library.
 */

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> books;
    private ArrayList<User> users;
    
    // Default constructor
    // Initializes the library with empty lists of books and users
    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Adds a new book to the library collection
    public void addBook(Book book) {
        books.add(book);
    }
    
 // Adds a new user to the library
    public void addUser(User user) {
        users.add(user);
    }

    // Returns the list of all books in the library
    public ArrayList<Book> getBooks() {
        return books;
    }

    // Returns the list of all users in the library
    public ArrayList<User> getUsers() {
        return users;
    }
}


