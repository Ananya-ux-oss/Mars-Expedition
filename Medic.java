public class Medic extends CrewMember {
    private int medicalskill;
    private int patientstreated;

    @Override
    public String toString() {
        return  "Name: " + getName();         
    }

    Medic(String name, int age, int health, int stamina, int experiencelevel, String role, int medicalskill, 
        int patientstreated) {
        super(name, age, health, stamina, experiencelevel,"medic");
        this.medicalskill = medicalskill;
        this.patientstreated = patientstreated;
    }

    public int getMedicalskill() {
        return medicalskill;
    }

    public int getPatientstreated() {
        return patientstreated;
    }

    //* might have to change to a better code(method body)--- probably WILL */

    public void TreatCrewmember(CrewMember member) {
        decreaseStamina(10);
        patientstreated++;
        member.increaseHealth(20);
        System.out.println("DOCTOR " + getName() + " treated " + member.getName());)
    }


    public void Checkhealthstatus( CrewMember cMember) { 
        decreaseStamina(5);
         System.out.println("Doctor " + getName() + " checked " + cMember.getName() + "s" + 
                       " health: \n" + cMember.getHealth()); 


    }

    @Override
    public void PerformDuty() {
        System.out.println(getName() + "  is with a patient");
    }

    @Override
    public void DisplayInfo() {
        System.out.println(
                 "=== DOCTOR ===" +
                  "\nNAME: " + getName()
                + "\nAGE: " + getAge()
                + "\nHEALTH: " + getHealth() 
                + "\nStamina: " + getStamina()
                + "\nEXPERIENCE-LEVEL: " + getExperienceLevel()
                + "\nROLE: " + getRole() 
                + "\nMEDICAL-SKILL: " +  medicalskill
                + "\nPatients-treated: " + patientstreated        
        );
    }
}
