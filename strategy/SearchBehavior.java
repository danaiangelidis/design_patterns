package strategy;
import java.util.ArrayList;

public interface SearchBehavior {    
    /**
     * Is used by the LinearSearch and BinarySearch children.
     * @param data The name of the ArrayList.
     * @param item The item that is being searched for in the ArrayList.
     */
    public boolean contains(ArrayList<String> data, String item);
}
