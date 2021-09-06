package observer;
/**
 * Written by Danai Angelidis
 */
public interface Subject {
    /**
     * To be used by BestSellers child.
     * @param observer The observer who wants to see the best sellers list.
     */
    public void registerObserver(Observer observer);

    /**
     * To be used by BestSellers child.
     * @param observer The observer who no longer wants to see the best sellers list.
     */
    public void removeObserver(Observer observer);

    /**
     * To be used by BestSellers child.
     * @param book The book that the observers are notified about.
     */
    public void notifyObservers(Book book);
}
