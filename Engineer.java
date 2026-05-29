public class Engineer extends CrewMember {
    private int systemsfixed;

    Engineer(String name, int age, int health, int stamina, int experiencelevel, String role, 
        int systemsfixed) {
            super(name, age, health, stamina, experiencelevel,role);
            this.repairskill = repairskill;
            }

    /* getters */

    public String getRepairskill() {
        return repairskill;
    }

    public int getSystemsfixed() {
        return systemsfixed;
    }

    /*setters */
    public void setSystemsFixed(int systemFixed){
        this.systemsFixed = systemFixed;
    }

    //METHODS
    public void Repairsytem() {
        DecreaseStamina(10);
        systemfixed++;
        System.out.println(getName() + " is performing general system repairs.");
    }

    public void Maintainequipment() {
        DecreaseStamina(15);
        System.out.println(getName() + " is maintaining station equipment.");
    }

    //OVERLOADING

    public void Repairsytem(String Systemname) {
        DecreaseStamina(10);
        systemfixed++;
        System.out.println(getName() + " is repairing " + Systemname );
    }

    //OVERLOADING

    public void repairsystem(Rover damagedrover) {
        damagedrover.checksystemstatus();
        damagedrover.repair();
        decreaseStamina(10);
        systemsfixed++;

        System.out.println(getName() + " is repairing " + damagedrover );
    }

    @Override
    public void PerformDuty() {
        System.out.println(getName() + "  is repairing systems");
    }

    @Override
    public void displayInfo() {
        System.out.println(
            "==== ENGINEER ===="     
            +"\nNAME: " + getName()
            + "\n AGE: " + getAge()
            + "\n HEALTH: " + getHealth()
            + "\n EXPERIENCE-LEVEL: " + getExperiencelevel()
            +  "\n ROLE: " + getRole() 
            +  "\n SYSTEMFIXED: " + systemsfixed        
        );
    }

}
