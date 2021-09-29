package iterator;
/**
 * Written by Danai Angelidis
 */
public class Airline {
    
    private String title;
    private Flight[] flights;
    private int size;

    /**
     * Constructs new flights array.
     */
    public Airline(String title) {
        this.title = title; 
        flights = new Flight[5];
    } 

    /**
     * Adds a flight to the array.
     * @param flightNum The flight number.
     * @param from The flight departure.
     * @param to The flight destination.
     * @param duration The flight duration.
     * @param transfers The number of transfers.
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers) {
        if(size != flights.length) {
            Flight newFlight = new Flight(flightNum, from, to, duration, transfers);
            flights[size] = newFlight;
            size++;
        }
        else {
            growArray(flights); 
        }  
    }

    /**
     * Returns the title of the airline.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Grows the array if it is too small.
     * @param flights The flights array.
     * @return Returns the new, longer array.
     */
    private Flight[] growArray(Flight[] flights) {
        Flight[] tempFlights = new Flight[flights.length*2];
        for(int i=0; i<flights.length; i++) {
            tempFlights[i] = flights[i];
        }
        return tempFlights;
    }

    /**
     * Creates a new flight iterator.
     * @return Returns the new flight iterator.
     */
    public FlightIterator createIterator() {
        FlightIterator flightIterator = new FlightIterator(flights);
        return flightIterator;
    }

}
