public class Engineer extends CrewMember {
    private int systemsfixed;

    Engineer(String name, int age, int health, int stamina, int experiencelevel, "Enginner", 
        int systemsfixed) {
            super(name, age, health, stamina, experiencelevel,role);
            this.systemsfixed = systemsfixed;
            }

    /* getters */

    public int getsystemsfixed() {
        return systemsfixed;
    }

    /*setters */
    public void setSystemsfixed(int systemFixed){
        this.systemsFixed = systemFixed;
    }

    //METHODS
    public void repairSytem() {
        decreaseStamina(10);
        systemfixed++;
        System.out.println(getName() + " is performing general system repairs.");
    }

    public void Maintainequipment() {
        decreaseStamina(15);
        System.out.println(getName() + " is maintaining station equipment.");
    }

    //OVERLOADING

    public void repairSytem(String Systemname) {
        decreaseStamina(10);
        systemfixed++;
        System.out.println(getName() + " is repairing " + Systemname );
    }

    //OVERLOADING

    public void repairSytem(Rover damagedrover) {
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
            +  "\nNAME: " + getName()
            +  "\nAGE: " + getAge()
            +  "\nHEALTH: " + getHealth()
            +  "\nEXPERIENCE-LEVEL: " + getExperiencelevel()
            +  "\nSYSTEMFIXED: " + systemsfixed        
        );
    }

}
