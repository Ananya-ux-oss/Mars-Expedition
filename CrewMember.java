public class CrewMember {
    private String name;
    private int age;
    private int health;
    private int stamina;
    private int experiencelevel;
    private String role;

    CrewMember(String name, int age, int health, int stamina, int experiencelevel, String role) {
        this.name = name;
        this.health = health;
        this.stamina = stamina;
        this.experiencelevel = experiencelevel;
        this.role = role;
    }

    /* getter */

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getExperiencelevel() {
        return experiencelevel;
    }
   
    public String getRole() {
        return role;
    }

    /* add setters */
    
    public void setName(String name){
        this.name = name;
    }












    public void PerformDuty() {
        System.out.println(name + "  is performing duties");
    }

    public void Rest() {
        stamina += 20;
        
        if(stamina > 100) {
            stamina = 100;
        }

        System.out.println(name + " rested and recoveres stamina");
    }

    public void Eat() {
        stamina += 10;
        health += 5;

        System.out.println(name + "Ate a meal");
    }

    public void DecreaseStamina(int amount) {
        stamina -= amount;
        if(stamina < 0) {
            stamina = 0;
        }

    }

    public void increaseStamina(int amount) {
        if(stamina >= 100) {
            stamina = 100;
        } else{
            stamina += amount;
        }

    }

    public void DisplayInfo() {
        System.out.println(
                  " | NAME: " + name
                + " | AGE: " + age
                + " | HEALTH: " + health
                + " | EXPERIENCE-LEVEL: " + experiencelevel
                +  "| ROLE: " + role
                
        );
    }

}
