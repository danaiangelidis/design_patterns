package factory;
import java.util.ArrayList;
/**
 * Written by Danai Angelidis
 */
public abstract class HousePlan {

    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    /**
     * Constructs a new house plan.
     * @param numRooms Number of rooms in the house.
     * @param numWindows Number of windows in the house.
     * @param squareFeet Square footage of the house.
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        this.materials = new ArrayList<String>();
        this.features = new ArrayList<String>();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
     }

    /**
     * Sets materials of the house - used by children.
     */
    abstract void setMaterials();

    /**
     *  Sets features of the house - used by children.
     */
    abstract void setFeatures();

    /**
     * Prints out materials used to make the house.
     * @return The materials arraylist that was filled by the children.
     */
    public ArrayList<String> getMaterials() {
        return this.materials;
    }

    /**
     * Prints out features in the house.
     * @return The features linked list that was filled by the children.
     */
    public ArrayList<String> getFeatures() {
        return this.features;
    }

    /**
     * Prints the number of rooms in the house.
     * @return The number of rooms in the house.
     */
    public int getNumRooms() {
        return this.numRooms;
    }

    /**
     * Prints the number of windows in the house.
     * @return The number of windows in the house.
     */
    public int getNumWindows() {
        return numWindows;
    }

    /**
     * Prints the square footage in the house.
     * @return The square footage in the house.
     */
    public int getSquareFeet() {
        return squareFeet;
    }

    /**
     * Puts all the getters neatly together.
     */
    public String toString() {
        return "Square Feet: "+getSquareFeet()+"\nRooms: "+getNumRooms()+"\nWindows: "
                +getNumWindows()+"\nMaterials: "+getMaterials()+"\nFeatures: "+getFeatures()+"\n";
    }
    
}
