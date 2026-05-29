public class Scientist extends CrewMember {
    private String specilization;
    private int researchpoints;

    Scientist(String name, int age, int health, int stamina, int experiencelevel, String role, String specilization,
        int researchpoints) {
            super(name, age, health, stamina, experiencelevel,role);
            this.specilization = specilization;
            this.researchpoints = researchpoints;
        }

    //getters
    
    public String getSpecialization() {
        return specilization;
    }

    public int researchPoints() {
        return researchpoints;
    }

    /*setters */

    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }
    


    public void conductResearch() {
        researchpoints += 10;
        DecreaseStamina(5);
        System.out.println(getName() + " is conducting research.");
    }

    public void analyzeSample() {
        researchpoints += 10;
        DecreaseStamina(5);
        System.out.println(getName() + " is analyzing Mars soil samples.");
    }

    @Override
    public void performDuty() {
        System.out.println(getName() + " is conducting scientific research.");
     }

    @Override
    public void displayInfo() {
        System.out.println(
                    "=== Scientist ===" 
                + "\nNAME: " + getName()
                + "\nAGE: " + getAge()
                + "\nHEALTH: " + getHealth()
                + "\nStamina: " + getStamina()
                + "\nEXPERIENCE-LEVEL: " + getExperienceLevel()
                + "\nSPECILIZATION: " + specilization
                + "\nresearchpoints: " + researchpoints        
        );
    }


}
