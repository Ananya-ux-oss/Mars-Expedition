public class Medic extends CrewMember {
    private int medicalSkill;
    private int patientsTreated;

    @Override
    public String toString() {
        return  "Name: " + getName();         
    }

    Medic(String name, int age, int health, int stamina, int experiencelevel, String role, int medicalSkill, 
        int patientsTreated) {
        super(name, age, health, stamina, experiencelevel,"Medic");
        this.medicalSkill = medicalSkill;
        this.patientsTreated = patientsTreated;
    }

    public int getMedicalSkill() {
        return medicalSkill;
    }

    public int getPatientsTreated() {
        return patientsTreated;
    }

    //* might have to change to a better code(method body)--- probably WILL */

    public void treatCrewmember(CrewMember member) {
        member.increaseHealth(20);
        decreaseStamina(10);
        patientsTreated++;
        
        System.out.println("DOCTOR " + getName() + " treated " + member.getName());
    }


    public void checkHealthStatus( CrewMember cMember) { 
        decreaseStamina(5);
         System.out.println("Doctor " + getName() + " checked " + cMember.getName() + "s" + 
                       " health: \n" + cMember.getHealth()); 


    }

    @Override
    public void performDuty() {
        System.out.println(getName() + "  is with a patient");
    }

    @Override
    public void displayInfo() {
        System.out.println(
                 "=== DOCTOR ===" +
                  "\nNAME: " + getName()
                + "\nAGE: " + getAge()
                + "\nHEALTH: " + getHealth() 
                + "\nStamina: " + getStamina()
                + "\nEXPERIENCE-LEVEL: " + getExperienceLevel()
                + "\nMEDICAL-SKILL: " +  medicalSkill 
                + "\nPatients-treated: " + patientsTreated       
        );
    }
}
