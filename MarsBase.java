import java.util.ArrayList;

public class MarsBase {
    private String basename ;
    private int oxygenlevel ;
    private int powerlevel ;
    private int foodsupply ;
    private int watersupply;
    private ArrayList<CrewMember> crew; //*polymorphism-- storing different object types in one list Same parameter type (CrewMember)Different actual objects */
//*rew.add(new Scientist()); crew.add(new Engineer()); crew.add(new Medic()); */
    
    

    MarsBase(String basename, int oxygenlevel, int powerlevel, int foodsupply, int watersupply, ArrayList<CrewMember> crew) {
        this.basename = basename;
        this.oxygenlevel = oxygenlevel;
        this.powerlevel = powerlevel;
        this.foodsupply = foodsupply;
        this.watersupply = watersupply;
        this.crew = crew;
    }

    public String getBasename() {
        return basename;
    }

    public int getOxygenlevel() {
        return oxygenlevel;
    }

    public int getPowerlevel() {
        return powerlevel;
    }

    public int getFoodsupply() {
        return foodsupply;
    }

    public int getWatersupply() {
        return watersupply;
    }

    public ArrayList<CrewMember> getCrew() {
        return crew;
    }

    public void Addcrewmembers(CrewMember member) { //*HAS-A relationship --- MarsBase HAS CrewMember objects inside it MarsBase HAS CrewMembers */
        
        crew.add(member);
        System.out.println(member.getName() + " has joined the base");
    }


   public void consumeResources() {

    oxygenlevel -= (crew.size() * 2); //*each crew member uses 2 oxygen per  */ //*crew size() -- number of astronuats */
    foodsupply -= (crew.size() * 1);
    watersupply -= (crew.size() * 1);
    powerlevel -= 2;

    if (oxygenlevel < 0) oxygenlevel = 0;
    if (foodsupply < 0) foodsupply = 0;
    if (watersupply < 0) watersupply = 0;
    if (powerlevel < 0) powerlevel = 0;

    System.out.println("Daily resources have been consumed.");
  }

/* might possibli contradict with emergencyeven class */
  public void EmergencyStatus() {
    if(oxygenlevel < 20 || powerlevel < 20 || foodsupply < 20 || watersupply < 20) {
        System.out.println("WARNING: Emergency detected in Mars Base!");
    }
    else {
        System.out.println("All systems are stable");
    }
  }


    public void refillResources() {

    oxygenlevel = 100;
    foodsupply = 100;
    watersupply = 100;

    System.out.println("All resources have been refilled.");
    }



    public void showBaseStatus() {
    System.out.println("Base Name: " + basename +
                       "Oxygen: " + oxygenlevel +
                       "Power: " + powerlevel +
                       "Food: " + foodsupply +
                       "Water: " + watersupply +
                       "Crew Count: " + crew.size());
    }  
}