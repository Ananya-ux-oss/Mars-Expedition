public class Medic extends CrewMember {
    private int medicalskill;
    private int patientstreated;

    Medic(String name, int age, int health, int stamina, int experiencelevel, String role, int medicalskill, 
        int patientstreated) {
        super(name, age, health, stamina, experiencelevel,role);
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
        DecreaseStamina(5);
        member.increaseStamina(20);
        System.out.println(getName() + " treated a crew member (+10 health)");
    }


    public void Checkhealthstatus( CrewMember cMember) { 
         System.out.println(getName() + " checked " + cMember.getName() + "s" + 
                       "health: " + cMember.getHealth());

    }

    @Override
    public void PerformDuty() {
        System.out.println(getName() + "  is with a patient");
    }

    @Override
    public void DisplayInfo() {
        System.out.println(
                  " | NAME: " + getName()
                + " | AGE: " + getAge()
                + " | HEALTH: " + getHealth()
                + " | EXPERIENCE-LEVEL: " + getExperiencelevel()
                +  "| ROLE: " + getRole() 
                +  "| MEDICAL-SKILL: " +  medicalskill
                +  "| Patients-treated: " + patientstreated        
        );
    }
}