public class Rover {
    private String rovername;
    private int batterylife;
    private int durability;
    private boolean isoperational;

     @Override 
    public String toString() {
        return  "rover: " +   rovername;
                
    }

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
     CheckSystemStaus();
    
    if(!isoperational) {
        System.out.println("Cannot drive. Rover is not operational.");
        return;
        }

    decreaseBatteryLife(10);
    decreaseDurability(5);

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
        if(durability <= 50 && batterylife <= 50) { 
            isoperational = false;
            System.out.println("System failed! Rover is not operational.");
            return;
        }
        if(durability <= 30) {
            isoperational = true;  
            System.out.println("Warning: Rover is critically damaged.");
        }
        
        if(batterylife <= 30) {
            isoperational = false; 
            System.out.println("Warning: Rovers battery life is low.");

        }
        else {
            isoperational = true;
             System.out.println("Rover is fully operational.");
        }
    }

    public void displayInfo() {
        System.out.println(
            n       "=== ROVER INFO ===" +
                  "\n rovername: " + rovername
                + " \n battrylife: " + batterylife
                + " \n durability: " + durability
                + " \n operational: " + isoperational                      
        );
    }
}
