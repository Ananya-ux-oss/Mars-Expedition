import java.util.ArrayList;

public class MarsBase {
    private String basename ;
    private double oxygenlevel ;
    private double powerlevel ;
    private int foodsupply ;
    private int watersupply;
    private ArrayList<CrewMember> crew; //*polymorphism-- storing different object types in one list Same parameter type (CrewMember)Different actual objects */
//*rew.add(new Scientist()); crew.add(new Engineer()); crew.add(new Medic()); */
    
    

    MarsBase(String basename, double oxygenlevel, double powerlevel, int foodsupply, int watersupply, ArrayList<CrewMember> crew) {
        this.basename = basename;
        this.oxygenlevel = oxygenlevel;
        this.powerlevel = powerlevel;
        this.foodsupply = foodsupply;
        this.watersupply = watersupply;
        this.crew = crew;
    }

    //GETTERS
    public String getBasename() {
        return basename;
    }

    public double getOxygenlevel() {
        return oxygenlevel;
    }

    public double getPowerlevel() {
        return powerlevel;
    }

    public int getFoodsupply() {
        return foodsupply;
    }

    public int getWatersupply() {
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
    public void Addcrewmembers(CrewMember member) { //*HAS-A relationship --- MarsBase HAS CrewMember objects inside it MarsBase HAS CrewMembers */
        
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

/* might possibli contradict with emergencyeven class */
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
            "\nBase Name: " + basename +
            "\nOxygen: " + oxygenlevel +
            "\nPower: " + powerlevel +
            "\nFood: " + foodsupply +
            "\nWater: " + watersupply +
            "\nCrew Count: " + crew.size());
    }  
}
