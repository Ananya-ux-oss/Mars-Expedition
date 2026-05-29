public class Pilot extends CrewMember { 
    private int navigationSkill;
    public int missionCompleted;

    Pilot(String name, int age, int health, int stamina, int experiencelevel, String role, int navigationSkill,
        int missionCompleted) {
        super(name, age, health, stamina, experiencelevel,"Pilot");
        this.navigationSkill = navigationSkill;
        this.missionCompleted = missionCompleted;
    }
    
    //GETTERS
    public int getNavigationSkill() {
        return navigationSkill;
    }
    public int getMissionCompleted() {
        return missionCompleted;
    }

    //METHODS
    public void operateRover(Rover rover) {
        rover.drive();
        if(rover.getIsOperational()){
            decreaseStamina(5);
            System.out.println(getName() + "is operating the mars rover");
        }
    }

    public void exploreSurface() {
        decreaseStamina(10);
        System.out.println(getName() + "is exploring mars surface");
    }

    @Override
    public String toString(){
        return getName();
    }
    
    @Override
    public void performDuty() {
        System.out.println(getName() + "is carrying out pilot operations.");
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "==== PILOT ===="
            + "\n NAME: " + getName()
            + "\n AGE: " + getAge()
            + "\n HEALTH: " + getHealth()
            + "\n EXPERIENCE-LEVEL: " + getExperienceLevel()
            + "\n ROLE: " + getRole() 
            + "\n NAVIGATION-SkILLS " + navigationSkill
            + "\n MISSION-COMPLETED: " + missionCompleted        
        );
    }   
}
