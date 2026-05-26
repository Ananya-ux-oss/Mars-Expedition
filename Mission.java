public class Mission {
    private String missionname;
    private String objective;
    private int difficulty;
    private boolean completed;
    /*private boolean isoperational;
    private int batterylife; // what is the battery life and durability of the mission?
    private int durability;*/

    Mission(String missionname, String objective, int difficulty, boolean completed/*boolean isoperational,
        int batterylife, int durability*/)
     {
        this.missionname = missionname;
        this.objective = objective;
        this.difficulty = difficulty;
        this.completed = completed;
        /*this.isoperational = isoperational;
        this.batterylife = batterylife;
        this.durability = durability;*/
    }

    public String getMissionname() {
        return missionname;
    }
    public String getObjective() {
        return objective;
    }
    public int getDifficulty() {
        return difficulty;
    }
    public boolean getCompleted() {
        return completed;
    }
    /*public boolean getIsoperational() {
        return isoperational;
    }

    public int getBatterylife() {
        return batterylife;
    }

    public int getDurability() {
        return durability;
    }*/

    public void Startmission(Rover rover, CrewMember person) {
        /*if(!isoperational) {
            System.out.println("Mission cannot start. Rover is not operational.");
            return;
        }
        System.out.println("Mission started successfully.");
        batterylife -= 10;
        durability -= 5*/
        rover.CheckSystemStaus();
        rover.drive();
        

    }

    public void completeMission(Rover rover, CrewMember person) {
    System.out.println("Mission completed successfully!");

    rover.decreaseBatteryLife(10);
    rover.decreaseDurability(15);
    person.DecreaseStamina(10);

   }

  
  public void displayMission() {
    System.out.println(
        "=== Mission Status Report ===" +
        "Mission Name: " + missionname +
        "Objective: " + objective +
        "Difficulty: " + difficulty +
        "Completed: " + completed 
        /*"Operational: " + isoperational +
        "Battery Life: " + batterylife +
        "Durability: " + durability*/
    );
  }
}