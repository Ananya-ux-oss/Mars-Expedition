public class Mission {
    private String missionname;
    private String objective;
    private int difficulty;
    private boolean completed;
    
    Mission(String missionname, String objective, int difficulty, boolean completed
        )
     {
        this.missionname = missionname;
        this.objective = objective;
        this.difficulty = difficulty;
        this.completed = completed;
        
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

    public void completeMission(Rover rover, CrewMember person) { //works

        if(rover.getoperations() && person.getStamina() > 35) {

        completed = true;

        System.out.println("Mission completed successfully!");

        rover.decreaseBatteryLife(10);
        rover.decreaseDurability(15);
        person.decreaseStamina(10);
    }
    else {
        completed = false;
        System.out.println("Mission failed."); // might need to remove this 
    }
}

  
  public void displayMission() {
    System.out.println(
       "=== Mission Status Report ===" +
        "\nMission Name: " + missionname +
        "\nObjective: " + objective +
        "\nDifficulty: " + difficulty +
        "\nCompleted: " + completed +
        "\nCrew stamina: " + person.getStamina() +
        "\nRover batterylife: "  + rover.getBatterylife()
        
    );
  }
}
