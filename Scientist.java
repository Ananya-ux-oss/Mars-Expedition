public class Scientist extends CrewMember {
    private String specilization;
    public int researchPoints;

    Scientist(String name, int age, int health, int stamina, int experienceLevel, String role, String specilization,
        int researchPoints) {
            super(name, age, health, stamina, experienceLevel,"Scientist");
            this.specilization = specilization;
            this.researchPoints = researchPoints;
        }

    //getters
    public String getSpecialization() {
        return specilization;
    }

    public int getResearchPoints() {
        return researchPoints;
    }

    /*setters */
    public void setSpecilization(String specilization) {
        this.specilization = specilization;
    }
    
    //Methods
    public void conductResearch() {
        researchPoints += 10;
        decreaseStamina(5);
        System.out.println(getName() + " is conducting research.");
    }

    public void analyzeSample() {
        researchPoints += 10;
        decreaseStamina(5);
        System.out.println(getName() + " is analyzing samples.");
    }

    @Override
    public void performDuty() {
        conductResearch();
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
                + "\nresearchpoints: " + researchPoints        
        );
    }


}
