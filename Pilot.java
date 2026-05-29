public class Pilot extends CrewMember { 
    private int navigationskill;
    private int missioncompleted;

    Pilot(String name, int age, int health, int stamina, int experiencelevel, String role, int navigationskill,
        int missioncompleted) {
        super(name, age, health, stamina, experiencelevel,"Pilot");
        this.navigationskill = navigationskill;
        this.missioncompleted = missioncompleted;
        }
    
    //GETTERS
    public int getNavigationskill() {
        return navigationskill;
    }
    public int Missioncompleted() {
        return missioncompleted;
    }

    //METHODS
    public void OperateRover(Rover rover) {
        rover.drive();
        if(rover.getOperations()){
            DecreaseStamina(5);
            System.out.println(getName() + "is operating the mars rover");
        }
    }

    public void Exploresurface() {
        DecreaseStamina(10);
        System.out.println(getName() + "is exploring mars surface");
    }

    @Override
    public String toString(){
        return getName();
    }
    
    public void PerformDuty() {
        System.out.println(getName() + "is carrying out pilot operations.");
     }

    
     @Override
    public void DisplayInfo() {
        System.out.println(
            "==== PILOT ===="
            +  " | NAME: " + getName()
            + " | AGE: " + getAge()
            + " | HEALTH: " + getHealth()
            + " | EXPERIENCE-LEVEL: " + getExperiencelevel()
            +  "| ROLE: " + getRole() 
            +  "| NAVIGATION-SkILLS " + navigationskill
            +  "| MISSION-COMPLETED: " + missioncompleted        
        );
    }

    
}
