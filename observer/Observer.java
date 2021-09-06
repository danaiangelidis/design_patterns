package observer;
/**
 * Written by Danai Angelidis
 */
public interface Observer {
    /**
     * To be used by the Store and Customer children.
     * @param book The book to add to the list.
     */
    public void update(Book book);

    /**
     * To be used by the Store and Customer children.
     */
    public void display();
}
