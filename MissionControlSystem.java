public class MissionControlSystem {
    public static void main(String[] args) {
        CrewMember member1 = new Pilot("Emilia", 20, 80, 100, 7, "Pilot", 10, 0); //Upcasting

        CrewMember crewMember = new CrewMember("Alex", 30, 80, 70, 5, "Crew");

        EmergencyEvents emergency = new EmergencyEvents("Oxygen Leak", 5, false);

        Engineer engineer = new Engineer("Maria", 32, 85, 75, 6, "Engineer", 10);

        ArrayList<CrewMember> crewList = new ArrayList<>();
        MarsBase marsBase = new MarsBase("Ares Base", 100.0, 100.0, 50, 50, crewList);

        Medic medic = new Medic("John", 29, 90, 80, 4, "Medic", 7, 3);

        Pilot pilot = new Pilot("Sara", 28, 88, 85, 5, "Pilot", 8, 2);

        Scientist scientist = new Scientist("Dr. Kim", 35, 85, 70, 7, "Scientist", "Geology", 15);

        Rover rover = new Rover("RoverX", 100, 100, true);

        ResearchProject researchProject = new ResearchProject("Soil Analysis", 40, false);
        
        Mission mission = new Mission("Explore Crater", "Collect samples", 3, false);
        
    }
}
