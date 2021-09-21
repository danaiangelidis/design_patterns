package factory;
/**
 * Written by Danai Angelidis
 */
public class TinyHomePlan extends HousePlan {

    /**
     * Constructs a tiny house plan.
     */
    public TinyHomePlan() {
        super(1, 5, 200);
        setMaterials();
        setFeatures();
    }

    /**
     * Adds the materials the house is made with to the materials arraylist.
     */    
    protected void setMaterials() {
        this.materials.add("Lumber");
        this.materials.add("Insulation");
        this.materials.add("Metal Roofing");
        this.materials.add("Hardware");
    }

    /**
     * Adds the features of the house to the features arraylist.
     */
    protected void setFeatures() {
        this.features.add("Natural Light");
        this.features.add("High Insulation");
        this.features.add("Creative Storage");
        this.features.add("Multipurpose areas");
        this.features.add("Multi-use applications");
    }

    /**
     * Adds the title of the house plan and calls the super toString.
     */
    public String toString() {
        return "Tiny Home\n"+super.toString();
    }
    
}
