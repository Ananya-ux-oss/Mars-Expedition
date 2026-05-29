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
        this.basename = baseName;
        this.oxygenlevel = oxygenLevel;
        this.powerlevel = powerLevel;
        this.foodsupply = foodSupply;
        this.watersupply = waterSupply;
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
        return watersupply;
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
    public void addCrewMembers(CrewMember member) { //*HAS-A relationship --- MarsBase HAS CrewMember objects inside it MarsBase HAS CrewMembers */
        
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

  public void EmergencyStatus() {
      if(oxygenlevel < 20 || powerlevel < 20 || foodsupply < 20 || watersupply < 20) {
          System.out.println("WARNING: Emergency detected in Mars Base!");
    }
      else {
          System.out.println("All systems are stable");
    }
  }

    public void refillResources() {
        oxygenLevel = 200000.00;
        foodSupply = 100000;
        waterSupply = 100000;
        powerLevel = 100.00;
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
