public class Rover {
    private String rovername;
    private int batterylife;
    private int durability;
    private boolean isoperational;

    Rover(String rovername, int batterylife, int durability, boolean isoperational) {
        this.rovername = rovername;
        this.batterylife = batterylife;
        this.durability = durability;
        this.isoperational = isoperational;
    }

    /* getters */

    public String getRovername() {
        return rovername;
    }
    
    public int getBatterylife() {
        return batterylife;
    }

    public int getDurability() {
        return durability;
    }

    public boolean getoperations() {
        return isoperational;
    }

    /*setters */

    public void setRovername(String rovername) {
        this.rovername = rovername;
    }

    public void setBatteryLife(int batterylife){
        this.batterylife = batterylife;
    }

    public void setDurability(int d){
        this.durability = d;
    }

    public void Setisoperational(boolean operational) {
        this.isoperational = operational;
    }


    public void decreaseBatteryLife(int discharge) {
        this.batterylife -= discharge;
    }

   

    public void decreaseDurability(int damage) {
        this.durability -= damage;
    }

   public void drive() {
    if (!isoperational) {
        System.out.println("Cannot drive. Rover is not operational.");
        return; //* without this even if the rover is not working it will still reduce durability and battery life */
    }

    System.out.println("Rover is driving across terrain.");
    }

    public void Recharge() {
        batterylife = 100;
        System.out.println("Rover is fully recharged.");
    }

    public void Repair() {
        durability += 20;
        if(durability > 100) {
            durability = 100;
        }
    }

    public void CheckSystemStaus() {
        if(durability <= 0 || batterylife <= 3) { 
            durability = 0;
            isoperational = false;
            System.out.println("System failed! Rover is not operational.");
        }
        else if(durability <= 30) {
            isoperational = true;
            System.out.println("Warning: Rover is critically damaged.");
        }
        else {
            isoperational = true;
            System.out.println("Rover is fully operational.");
        }
    }

    public void displayInfo() {
        System.out.println(
                  " | rovername: " + rovername
                + " | battrylife: " + batterylife
                + " | durability: " + durability
                + " | operational: " + isoperational                
        );
    }
}