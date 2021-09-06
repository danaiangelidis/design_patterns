package observer;
import java.util.LinkedList;
import java.util.Queue;
/*
 * Written by Danai Angelidis
 */
public class Store implements Observer {

    private Subject subject;
    private String title;
    private Queue<Book> bestSellers;

    /**
     * Constructor for a new queue for the best sellers list.
     * @param subject New subject
     */
    public Store(Subject subject) {
        this.bestSellers = new LinkedList();
        this.subject = subject;       
    }

    /**
     * Adds a book to the best sellers list so that there are only five on the list at a time.
     * @param book The book that is added to the best sellers list.
     */
    public void update(Book book) {
        if(this.bestSellers.size() < 5) {
            this.bestSellers.add(book);
        }
        else if(this.bestSellers.size() >= 5) {
            this.bestSellers.remove();
            this.bestSellers.add(book);
        }
    }

    /**
     * Displays the best sellers list.
     */
    public void display() {
        this.bestSellers.toString();
    }
}
