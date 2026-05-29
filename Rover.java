public class Rover {
    private String roverName;
    private int batteryLife;
    private int durability;
    private boolean isOperational;

     @Override 
    public String toString() {
        return  "rover: " +   roverName;
                
    }

    Rover(String roverName, int batteryLife, int durability, boolean isOperational) {
        this.roverName = roverName;
        this.batteryLife = batteryLife;
        this.durability = durability;
        this.isOperational = isOperational;
    }

    /* getters */
    public String getRoverName() {
        return roverName;
    }
    
    public int getBatteryLife() {
        return batteryLife;
    }

    public int getDurability() {
        return durability;
    }

    public boolean getIsOperational() {
        return isOperational;
    }

    /*setters */
    public void setRoverName(String roverName) {
        this.roverName = roverName;
    }

    public void setBatteryLife(int batteryLife){
        this.batteryLife = batteryLife;
    }

    public void setDurability(int d){
        this.durability = d;
    }

    public void setIsOperational(boolean isOperational) {
        this.isOperational = isOperational;
    }

    public void decreaseBatteryLife(int discharge) {
        this.batteryLife -= discharge;
    }
   
    public void decreaseDurability(int damage) {
        this.durability -= damage;
    }

   public void drive() {
        checkSystemStaus();
    
        if(!isOperational) {
            System.out.println("Cannot drive. Rover is not operational.");
            return;
        }else{
            System.out.println("Rover is driving across terrain."); 
        }
    }

    public void recharge() {
        batteryLife = 100;
        System.out.println("Rover is fully recharged.");
    }

    public void repair() {
        durability += 20;
        if(durability > 100) {
            durability = 100;
        }
    }

    public void checkSystemStaus() {
        if(durability <= 50 && batteryLife <= 50) { 
            isOperational = false;
            System.out.println("System failed! Rover is not operational.");
            return;
        }
        if(durability <= 30) {
            isOperational = true;  
            System.out.println("Warning: Rover is critically damaged.");
        }
        
        if(batteryLife <= 30) {
            isOperational = false; 
            System.out.println("Warning: Rovers battery life is low.");

        }
        else {
            isOperational = true;
             System.out.println("Rover is fully operational.");
        }
    }

    public void displayInfo() {
        System.out.println(
            "=== ROVER INFO ===" 
            + "\n rovername: " + roverName
            + "\n battrylife: " + batteryLife
            + "\n durability: " + durability
            + "\n operational: " + isOperational                      
        );
    }
}
