public class Engineer extends CrewMember {
    private int systemFixed;

    Engineer(String name, int age, int health, int stamina, int experienceLevel, String role,
        int systemsFixed) {
            super(name, age, health, stamina, experienceLevel,"Engineer");
            this.systemFixed = systemsFixed;
            }

    /* getters */

    public int getsystemsfixed() {
        return systemFixed;
    }

    /*setters */
    public void setSystemFixed(int systemFixed){
        this.systemFixed = systemFixed;
    }

    //METHODS
    public void repairSytem() {
        decreaseStamina(10);
        systemFixed++;
        System.out.println(getName() + " is performing general system repairs.");
    }

    public void maintainEquipment() {
        decreaseStamina(5);
        System.out.println(getName() + " is maintaining station equipment.");
    }

    //OVERLOADING

    public void repairSytem(String systemName) {
        decreaseStamina(10);
        systemFixed++;
        System.out.println(getName() + " is repairing " + systemName );
    }

    //OVERLOADING

    public void repairSytem(Rover damagedRover) {
        damagedRover.checkSystemStaus();
        damagedRover.repair();
        decreaseStamina(10);
        systemFixed++;

        System.out.println(getName() + " is repairing " + damagedRover );
    }

    @Override
    public void performDuty() {
        System.out.println(getName() + "  is repairing systems");
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "==== ENGINEER ===="     
            +  "\nNAME: " + getName()
            +  "\nAGE: " + getAge()
            +  "\nHEALTH: " + getHealth()
            +  "\nSYSTEMFIXED: " + systemFixed        
        );
    }

}
