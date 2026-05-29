public class Mission {
    private String missionName;
    private String objective;
    private int difficulty;
    private boolean isCompleted;
    
    Mission(String missionName, String objective, int difficulty, boolean isCompleted) {
        this.missionName = missionName;
        this.objective = objective;
        this.difficulty = difficulty;
        this.isCompleted = isCompleted;     
    }

    //Getters
    public String getMissionName() {
        return missionName;
    }
    public String getObjective() {
        return objective;
    }
    public int getDifficulty() {
        return difficulty;
    }
    public boolean getIsCompleted() {
        return isCompleted;
    }

    //SETTER
    public void setDifficulty(int difficulty){
        this.difficulty = difficulty;
    }

    public void setIsCompleted(boolean isCompleted){
        this.isCompleted = isCompleted;
    }

    //Methods

    public void startMission(Rover rover, Pilot person){
        person.operateRover(rover);
    }

    public void completeMission(Rover rover, Pilot person) { //works
        if(rover.getIsOperational() && person.getStamina() > 35) {

            isCompleted = true;
            System.out.println("Mission completed successfully!");

            rover.decreaseBatteryLife(10);
            rover.decreaseDurability(15);
            person.decreaseStamina(10);
            person.missionCompleted += 1;
        }
        else {
            isCompleted = false;
            System.out.println("Mission failed."); // might need to remove this 
        }
    }

    public void displayMission(Rover rover, Pilot person) {
        System.out.println(
            "=== Mission Status Report ===" +
            "\nMission Name: " + missionName +
            "\nObjective: " + objective +
            "\nDifficulty: " + difficulty +
            "\nCompleted: " + isCompleted +
            "\nCrew stamina: " + person.getStamina() +
            "\nRover batterylife: "  + rover.getBatteryLife()
        
    );
  }
}
