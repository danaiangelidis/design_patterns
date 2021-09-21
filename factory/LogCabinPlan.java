package factory;
/**
 * Written by Danai Angelidis
 */
public class LogCabinPlan extends HousePlan{

    /**
     * Constructs a log cabin house plan.
     */
    public LogCabinPlan() {
        super(2, 10, 1800);
        setMaterials();
        setFeatures();
    }

    /**
     * Adds the materials the house is made with to the materials arraylist.
     */
    protected void setMaterials() {
        this.materials.add("Log Siding");
        this.materials.add("Board and Batten Siding");
        this.materials.add("White Pine");
    }

    /**
     * Adds the features of the house to the features arraylist.
     */
    protected void setFeatures() {
        this.features.add("Timbered Roof");
        this.features.add("High Insulation");
        this.features.add("Rustic Effect");
    }

    /**
     * Adds the title of the house plan and calls the super toString.
     */
    public String toString() {
        return "Log Cabin\n"+super.toString();
    }

}
