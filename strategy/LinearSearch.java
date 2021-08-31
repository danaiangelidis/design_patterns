package strategy;
import java.util.ArrayList;

public class LinearSearch implements SearchBehavior {
    /**
     * Linearly searches for the name determined by "item".
     * @param data The name of the ArrayList.
     * @param item The item that is being searched for in the ArrayList.
     * @return Returns true if the name is found and false if it is not.
     */
    public boolean contains(ArrayList<String> data, String item) {
        boolean result = false;
        for(int i=0; i<data.size(); i++) {
            if(data.contains(item)) {
                result = true;
            }  
        }
        return result;
    }

}
    
