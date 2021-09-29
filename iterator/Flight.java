package iterator;
/**
 * Written by Danai Angelidis
 */
public class Flight {
    
    private String flightNum;
    private String from;
    private String to;
    private int duration;
    private int transfers;

    /**
     * Constructs a new flight.
     * @param flightNum The flight number.
     * @param from The flight departure.
     * @param to The flight destination.
     * @param duration The flight duration.
     * @param transfers The number of transfers.
     */
    public Flight(String flightNum, String from, String to, int duration, int transfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.duration = duration;
        this.transfers = transfers;
    }

    /**
     * Returns the flight departure.
     */
    public String getFrom() {
        return this.from;
    } 
    
    /**
     * Returns the flight destination.
     */
    public String getTo() {
        return this.to;
    }

    /**
     * Returns the duration of the flight.
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * Returns the number of transfers.
     */
    public int getNumTransfers() {
        return this.transfers;
    }

    /**
     * Returns a toString of all the flight information.
     */
    public String toString() {
        return "Flight Number: "+flightNum+"\nFrom: "+getFrom()+"\nTo: "+getTo()+"\nDuration: "+getDuration()+"\n"+getNumTransfers()+" transfer(s)";
    }
    
}
