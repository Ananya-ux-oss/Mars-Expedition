public class Engineer extends CrewMember {
    private String repairskill;
    private int systemsfixed;

    Engineer(String name, int age, int health, int stamina, int experiencelevel, String role, String repairskill,
        int systemsfixed) {
            super(name, age, health, stamina, experiencelevel,role);
            this.repairskill = repairskill;
            this.systemsfixed = systemsfixed;
        }

    /* getters */

    public String getRepairskill() {
        return repairskill;
    }

    public int getSystemsfixed() {
        return systemsfixed;
    }

    /* ADDsetters */









    public void Repairsytem() {
        DecreaseStamina(10);
        System.out.println(getName() + " is performing general system repairs.");
    }

    public void Maintainequipment() {
        DecreaseStamina(15);
        systemsfixed++;
        System.out.println(getName() + " is maintaining station equipment.");
    }

    /** over-loading  */

    public void Repairsytem(String Systemname) {
        DecreaseStamina(10);
        System.out.println(getName() + " is repairing " + Systemname );
    }

    //Overloading

    public void Repairsytem(Rover damagedrover) {
        DecreaseStamina(10);
        damagedrover.setDurability(80);
        System.out.println(getName() + " is repairing " + damagedrover );
    }

     /** over-loading(maybe add or leave out not sure)  */

     public void Repairsytem(String Systemname, int urgency) {
        DecreaseStamina(10);
        System.out.println(getName() + " is repairing " + Systemname + "urgency: " + urgency);
    }

    @Override
    public void PerformDuty() {
        System.out.println(getName() + "  is repairing systems");
    }

    @Override
    public void DisplayInfo() {
        System.out.println(
                  " | NAME: " + getName()
                + " | AGE: " + getAge()
                + " | HEALTH: " + getHealth()
                + " | EXPERIENCE-LEVEL: " + getExperiencelevel()
                +  "| ROLE: " + getRole() 
                +  "| REPAIR SKILLD: " +  repairskill
                +  "| SYSTEMFIXED: " + systemsfixed        
        );
    }

}