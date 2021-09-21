package factory;
/**
 * Written by Danai Angelidis
 */
public class HousePlanFactory {
    
    /**
     * Creates a house plan depending on user input.
     * @param typel Type of house plan requested.
     * @return The type of house plan.
     */
    public static HousePlan createHousePlan(String typel) {
        if(typel.equalsIgnoreCase("log cabin")) {
            LogCabinPlan logCabin = new LogCabinPlan();
            return logCabin;
        }
        else if(typel.equalsIgnoreCase("tiny home")) {
            TinyHomePlan tinyHome = new TinyHomePlan();
            return tinyHome;
        }
        else if(typel.equalsIgnoreCase("contemporary home")) {
            ContemporaryPlan contemporaryPlan = new ContemporaryPlan();
            return contemporaryPlan;
        }
        System.out.println("That is not valid");
        return null;
    }
    
}
