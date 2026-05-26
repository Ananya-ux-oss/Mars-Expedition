import java.util.ArrayList;

class ResourceManager {
    private int oxygenSupply;
    private int foodSupply;
    private int fuelSupply;
    private int waterSupply;
    private ArrayList<CrewMember> crew;

    ResourceManager(int oxygenSupply, int foodSupply, int fuelSupply, int waterSupply,ArrayList<CrewMember> crew) {
        this.oxygenSupply = oxygenSupply;
        this.foodSupply = foodSupply;
        this.fuelSupply = fuelSupply;
        this.waterSupply = waterSupply;
        this.crew = crew;
    }

    public int getOxygensupply() {
        return oxygenSupply;
    }
    public int foodSupply() {
        return foodSupply;
    }
    public int fuelSupply() {
        return fuelSupply;
    }
    public int waterSupply() {
        return waterSupply;
    }

    public void useResources() {

    oxygenSupply -= (crew.size() * 2);
    foodSupply -= (crew.size() * 1);
    waterSupply -= (crew.size() * 1);
    
    
    System.out.println("Resources have been used for daily operations.");
    }

    public void refillResources() {

    oxygenSupply = 100;
    foodSupply = 100;
    waterSupply = 100;

    System.out.println("All resources have been refilled.");
    }

    public void displayResources() {

    System.out.println(
        "=== Mars Base Resources ===" +
        "\nOxygen Level: " + oxygenSupply +
        "\nFood Supply: " + foodSupply +
        "\nWater Supply: " + waterSupply +
        "\nCrew Count: " + crew.size()
    );
}
  
} 