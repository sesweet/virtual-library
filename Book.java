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
}
