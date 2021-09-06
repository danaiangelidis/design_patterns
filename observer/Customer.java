package observer;
import java.util.ArrayList;
/*
 * Written by Danai Angelidis
 */
public class Customer implements Observer {

    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList;

    /**
     * Constructs a customer and their wishlist.
     * @param subject Subject.
     * @param firstName First name of the customer.
     * @param lastName Last name of the customer.
     */
    public Customer(Subject subject, String firstName, String lastName) {
        this.wishList = new ArrayList<Book>();
        this.subject = subject;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Adds a new book to the customer's wishlist.
     * @param book Book to be added to the wishlist.
     */
    public void update(Book book) {
        this.wishList.add(book);
    }

    /**
     * Displays the customer's wishlist.
     */
    public void display() {
        this.wishList.toString();
    }
}
