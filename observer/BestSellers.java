package observer;
import java.util.ArrayList;
/**
 * Written by Danai Angelidis
 */
public class BestSellers implements Subject{

    private ArrayList<Observer> observers;
    private ArrayList<Book> bestSellers;

    /**
     * Constructor for a best sellers list.
     */
    public BestSellers() {
        this.observers = new ArrayList<Observer>();
        this.bestSellers = new ArrayList<Book>();
    }

    /**
     * Registers a new observer to the list.
     * @param observer Observer to be added to the list.
     */
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    /**
     * Removes an observer from the list.
     * @param observer Observer to be removed from the list.
     */
    public void removeObserver(Observer observer) {
       this.observers.remove(observer);
    }

    /**
     * Notifies the observers about a new book on the best sellers list.
     * @param book Book that the observers are to be notified about.
     */
    public void notifyObservers(Book book) {
        this.observers.toString();
    }

    /**
     * Adds book to the best sellers list and notifies the observers.
     * @param book Book to be added to the best sellers list.
     */
    public void addBook(Book book) {
        this.bestSellers.add(book);
        notifyObservers(book);
    }
}
