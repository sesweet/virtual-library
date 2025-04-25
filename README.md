# virtual-library
Our Virtual Library allows users to create an account in our system, checkout up to 5 books from our digital library, and return them when they are finished.

Contributors: Sarah Sweet and Jared Sanders

Classes
Book - Sarah Sweet
User - Sarah Sweet
Library - Jared Sanders
LibraryGUI - Jared Sanders

*
 * Project: Virtual Library
 * Author: Sarah Sweet
 * Date: 04/25/2025
 * Description: A book within the virtual library
 */
package virtuallibrary;

/**
 *
 * @author sarahsweet
 */
public class Book {

    // List of attributes for the Book class
    public String title;
    public String author;

    // Constructor with parameters
   
    public Book(String bookTitle, String bookAuthor) {
        title = bookTitle;
        author = bookAuthor;

    }

    // Getsthe book's title.
    public String getTitle() {
        return title;
    }

    //Sets the book's title.
    public void setTitle(String bookTitle) {
        title = bookTitle;

    }

    // Gets the book's author.
    public String getAuthor() {
        return author;

    }

    // Sets the book's author.
    public void setAuthor(String bookAuthor) {
        author = bookAuthor;

    }

   public class User {

    // Attributes for the User class
    public int userId;
    public String name;

    // Constructor with parameters
    public User(int id, String usersName) {
        userId = id;
        name = usersName;

    }

    // Gets the user's id number
    public int getUserId() {
        return userId;

    }

    // Sets the user's id
    public void setUserId(int id) {
        userId = id;

    }

    //Gets the user's name
    public String getName() {
        return name;

    }

    // Sets the user's name
    public void setName(String userName) {
        name = userName;

    }
}

}

