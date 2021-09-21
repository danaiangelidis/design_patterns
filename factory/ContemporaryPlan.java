package factory;
/**
 * Written by Danai Angelidis
 */
public class ContemporaryPlan extends HousePlan {

    /**
     * Constructs a contemporary house plan.
     */
    public ContemporaryPlan() {
        super(5, 40, 3000);
        setMaterials();
        setFeatures();
    }

    /**
     * Adds the materials the house is made with to the materials arraylist.
     */
    protected void setMaterials() {
        this.materials.add("Ceramics");
        this.materials.add("High-Strength Alloys");
        this.materials.add("Composites");
    }

    /**
     * Adds the features of the house to the features arraylist.
     */
    protected void setFeatures() {
        this.features.add("Oversized Windows");
        this.features.add("Unconventional Roofs");
        this.features.add("Minimalism");
        this.features.add("Open Floor Plan");
        }

    /**
     * Adds the title of the house plan and calls the super toString.
     */
    public String toString() {
        return "Contemporary Home\n"+super.toString();
    }
    
}
