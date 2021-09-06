package strategy;
import java.util.ArrayList;

public class GuestList {
   
    private String title;
    ArrayList<String> people = new ArrayList<String>();
    private SearchBehavior searchBehavior;
    
    /**
     * Sets the title of the Guest List.
     * @param aTitle is the inputted title of the Guest List.
     */
    public GuestList(String aTitle) {
        this.setTitle(aTitle);
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();
    }

    /**
     * Sets the title of the Guest List.
     * @param aTitle is the inputted title of the Guest List.
     */
    public void setTitle(String aTitle) {
        this.title = aTitle;
    }

    /**
     * Retrieves the title of the Guest List.
     * @return Returns the title of the Guest List for the user.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gives the names of everyone in the Guest List.
     * @return Returns the contents of the ArrayList people.
     */
    public ArrayList<String> getList()	{
        return people;
    }

    /**
     * Sets the search behavior, deciding if it will be a Binary search or a Linear search.
     * @param searchBehavior The user decides what kind of search it will be.
     */
    public void setSearchBehavior(SearchBehavior searchBehavior) {
        this.searchBehavior = searchBehavior;
    }

    /**
     * Adds names to the Guest List.
     * @param person The name of the person that will be added to the list.
     * @return Returns false if the person already exists on the list and does not add the name.
     *         Returns true if the person does not already exist and adds their name to the list.
     */
    public boolean add(String person) {
        person = person.toLowerCase();
        if(people.contains(person)) {
            return false;
        }
        else {
            people.add(person);
            return true;
        }
    }

    /**
     * Removes people from the Guest List.
     * @param person The name of the person that will be removed from the list.
     * @return Returns true if the person exists on the list and removes their name.
     *         Returns false if the person does not exist and does not remove their name.
     */
    public boolean remove(String person) {
        person = person.toLowerCase();
        if(people.contains(person)) {
            people.remove(person);
            return true;
        }
        else {
            return false;
        }
    }
}
