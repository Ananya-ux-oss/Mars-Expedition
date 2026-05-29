public class CrewMember {
    private String name;
    private int age;
    private int health;
    private int stamina;
    private int experienceLevel;
    private String role;

    CrewMember(String name, int age, int health, int stamina, int experienceLevel, String role) {
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

    public int getExperienceLevel() {
        return experiencelevel;
    }
   
    public String getRole() {
        return role;
    }

    /* SETTERS */
    
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }    

    public void setHealth(int health){
        this.health = health;
    }

    public void setStamina(int stamina){
        this.stamina = stamina;
    }

    public void setExperianceLevel(int experienceLevel){
        this.experienceLevel = experienceLevel;
    }

    public void setRole(String role){
        this.role = role;
    }

    //METHODS
    public void performDuty() {
        System.out.println(name + "  is performing duties");
    }

    public void rest() {
        stamina += 20;
        
        if(stamina > 100) {
            stamina = 100;
        }

        System.out.println(name + " rested and recoveres stamina");
    }

    public void eat() {
        stamina += 10;
        health += 5;

        System.out.println(name + "Ate a meal");
    }

    public void decreaseStamina(int amount) {
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

    public void increaseHealth(int hp) {

        health += hp;
        if(health >= 80) {
            health = 80;
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
