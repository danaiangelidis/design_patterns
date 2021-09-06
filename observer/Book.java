package observer;
/**
 * Written by Danai Angelidis
 */
public class Book {
    
    private String title;
    private String authorFirstName;
    private String authorLastName;

    /**
     * Constructs a new book.
     * @param title The title of the book.
     * @param authorFirstName The first name of the author of the book.
     * @param authorLastName The last name of the author of the book.
     */
    public Book(String title, String authorFirstName, String authorLastName) {
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    } 

    /**
     * The getter for the title of the book.
     * @return Returns the title of the book.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * The getter for the first name of the author of the book.
     * @return Returns the first name of the author of the book.
     */
    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    /**
     * The getter for the last name of the author of the book.
     * @return Returns the last name of the author of the book
     */
    public String getAuthorLastName() {
        return this.authorLastName;
    }

    /**
     * The toString that prints the title and the name of the author.
     */
    public String toString() {
        return this.title+" by: "+this.authorFirstName+" "+this.authorLastName+".";
    }
}
