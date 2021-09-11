package decorator;
import java.util.ArrayList;
/**
 * Written by Danai Angelidis
 */
public abstract class Character {

    protected ArrayList<String> sections;

    /**
     * Initializes the arraylist.
     */
    public Character() {
        this.sections = new ArrayList<String>();
    }

    /**
     * Draws the little potato head!
     */
    public void draw() {
        for(int i=0; i<this.sections.size(); i++) {
            System.out.println(this.sections.get(i));
        }
    }

}
