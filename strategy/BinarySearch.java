package strategy;
import java.util.ArrayList;
import java.util.*;

public class BinarySearch implements SearchBehavior {
	/**
	 * Uses Binary Search to search for the name determined by "item".
	 * @param data The name of the ArrayList.
     * @param item The item that is being searched for in the ArrayList.
	 * @return Returns true if the name is found and false if it is not.
	 */
	public boolean contains(ArrayList<String> data, String item) {
		
		Collections.sort(data);
		String middle = data.get(data.size()/2);
	
		if(item.equalsIgnoreCase(middle)) {
			return true;
		}
		else if(item.compareTo(middle) == -1) {
			ArrayList<String> first = new ArrayList<String>();
			for(int i=0; i<data.size()/2; i++) {
				first.add(data.get(i));
			}
			return contains(first, item);
		}
		else if(item.compareTo(middle) == 1) {
			ArrayList<String> second = new ArrayList<String>();
			for(int i=data.size()/2; i<data.size(); i++) {
				second.add(data.get(i));
			}
			return contains(second, item);
		}
		return false;
	}
}
