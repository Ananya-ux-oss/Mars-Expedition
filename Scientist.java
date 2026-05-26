public class Scientist extends CrewMember {
    private String specilization;
    private int researchpoints;

    Scientist(String name, int age, int health, int stamina, int experiencelevel, String role, String specilization,
        int researchpoints) {
            super(name, age, health, stamina, experiencelevel,role);
            this.specilization = specilization;
            this.researchpoints = researchpoints;
        }
    
    public String getSpecialization() {
        return specilization;
    }

    public int researchpoints() {
        return researchpoints;
    }

    /* Add setters */






    

    public void conductresearch() {
        researchpoints += 10;
        DecreaseStamina(5);
        System.out.println(getName() + " is conducting research.");
    }

    public void AnalyzeSample() {
        researchpoints += 10;
        DecreaseStamina(5);
        System.out.println(getName() + " is analyzing Mars soil samples.");
        System.out.println("New discoveries recorded!");
    }

    @Override
    public void PerformDuty() {
        System.out.println(getName() + " is conducting scientific research.");
     }

    @Override
    public void DisplayInfo() {
        System.out.println(
                  " | NAME: " + getName()
                + " | AGE: " + getAge()
                + " | HEALTH: " + getHealth()
                + " | EXPERIENCE-LEVEL: " + getExperiencelevel()
                +  "| ROLE: " + getRole() 
                +  "| SPECILIZATION: " + specilization
                +  "| researchpoints: " + researchpoints        
        );
    }


}