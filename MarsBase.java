import java.util.ArrayList;

public class MarsBase {
    private String baseName ;
    private double oxygenLevel ;
    private double powerLevel ;
    private int foodSupply ;
    private int waterSupply;
    private ArrayList<CrewMember> crew; //*polymorphism-- storing different object types in one list Same parameter type (CrewMember)Different actual objects */
//*crew.add(new Scientist()); crew.add(new Engineer()); crew.add(new Medic()); */
    
    

    MarsBase(String baseName, double oxygenLevel, double powerLevel, int foodSupply, int waterSupply, ArrayList<CrewMember> crew) {
        this.baseName = baseName;
        this.oxygenLevel = oxygenLevel;
        this.powerLevel = powerLevel;
        this.foodSupply = foodSupply;
        this.waterSupply = waterSupply;
        this.crew = crew;
    }

    //GETTERS
    public String getBaseName() {
        return baseName;
    }

    public double getOxygenLevel() {
        return oxygenLevel;
    }

    public double getPowerLevel() {
        return powerLevel;
    }

    public int getFoodSupply() {
        return foodSupply;
    }

    public int getWaterSupply() {
        return waterSupply;
    }

    public ArrayList<CrewMember> getCrew() {
        return crew;
    }
    
    //SETTERS
    public void setBaseName(String baseName) {
        this.baseName = baseName;
    }

    public void setOxygenLevel(double oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public void setPowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }

    public void setFoodSupply(int foodSupply) {
        this.foodSupply = foodSupply;
    }

    public void setWaterSupply( int waterSupply) {
        this.waterSupply = waterSupply;
    }

    //METHODS
    public void addCrewMembers(CrewMember member) {
        crew.add(member);
        System.out.println(member.getName() + " has joined the base");
    }


   public void consumeResources(int time, EmergencyEvents emergency) {
        double minPower = 20.00;
        double minOxygen = this.oxygenLevel / 5;
        int minFood = this.foodSupply / 5;
        int minWater = this.waterSupply / 5;

        while(time > 0){
            oxygenLevel -= crew.size()*10;
            foodSupply -= crew.size()*2;
            waterSupply -= crew.size()*2;
            powerLevel -= 2;
            time -= 1;

            if ((oxygenLevel < minOxygen) || (foodSupply < minFood) || (waterSupply < minWater) || (powerLevel < minPower)) {
                System.out.println("CRITICAL WARNING: Resources depleted! Consumption halted.");
                break; // Stop the loop immediately
            }
        } 
    }
    // need to improve this
    public void emergencyStatus() {
        if(oxygenLevel < 20 || powerLevel < 20 || foodSupply < 20 || waterSupply < 20) {
            System.out.println("WARNING: Emergency detected in Mars Base!");
        }
        else {
            System.out.println("All systems are stable");
        }
    }
    // When you see this, I tried editing this.
    public void refillResources() {
        double maxOxygen = this.oxygenLevel;
        int maxFood = this.foodSupply;
        int maxWater = this.waterSupply;

        this.oxygenLevel = maxOxygen;
        this.foodSupply = maxFood;
        this.waterSupply = maxWater;
        this.powerLevel = 100.00;
        System.out.println("All resources have been refilled.");
    }
    
    public void showBaseStatus() {
        System.out.println(
            "\nBase Name: " + baseName +
            "\nOxygen: " + oxygenLevel +
            "\nPower: " + powerLevel +
            "\nFood: " + foodSupply +
            "\nWater: " + waterSupply +
            "\nCrew Count: " + crew.size());
    }  
}
