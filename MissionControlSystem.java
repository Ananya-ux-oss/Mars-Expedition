import java.util.ArrayList;

public class MissionControlSystem {
    public static void main(String[] args) {
        CrewMember member1 = new Pilot("Emilia", 20, 80, 100, 7, "Pilot", 10, 0); //Upcasting

        CrewMember crewMember = new CrewMember("Alex", 30, 80, 70, 6, "Support");

        EmergencyEvents emergency = new EmergencyEvents("Oxygen Leak", 5, false);

        Engineer engineer = new Engineer("Maria", 32, 80, 75, 8, "Engineer", 10);

        ArrayList<CrewMember> crewList = new ArrayList<>();
        MarsBase MarsStation = new MarsBase("Ares Base", 100.0, 100.0, 70, 70, crewList);

        Medic medic = new Medic("John", 29, 80, 80, 8, "Medic", 7, 3);

        Pilot pilot = new Pilot("Sara", 28, 80, 85, 5, "Pilot", 8, 2);

        Scientist scientist = new Scientist("Kim", 35, 80, 70, 7, "Scientist", "Geology", 15);

        Rover rover = new Rover("RoverX", 100, 100, true);

        ResearchProject researchProject = new ResearchProject("Soil Analysis", 40, false);
        
        Mission mission = new Mission("Explore Crater", "Collect samples", 3, false);


        MarsStation.addCrewMembers(member1);
        MarsStation.addCrewMembers(crewMember);
        MarsStation.addCrewMembers(engineer);
        MarsStation.addCrewMembers(medic);
        MarsStation.addCrewMembers(pilot);
        MarsStation.addCrewMembers(scientist);
    }
}
