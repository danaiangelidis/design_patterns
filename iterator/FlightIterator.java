package iterator;
/**
 * Written by Danai Angelidis
 */
public class FlightIterator implements Iterator {
    
    private Flight[] flights;
    private int position;

    /**
     * Constructs a new flight iterator.
     * @param flights The array of flights to be iterated through.
     */
    public FlightIterator(Flight[] flights) {
        this.flights = flights;
    }

    /**
     * Checks if the array has a next element.
     */
    public boolean hasNext() {
        if(position >= flights.length || flights[position] == null) {
			return false;
		} else {
			return true;
		}
    }

    /**
     * Returns the next element in the flights array.
     */
    public Flight next() {
        Flight next = flights[position];
		position++;
		return next;
    }

}
