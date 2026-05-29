public class MissionControlSystem {
    public static void main(String[] args) {
        Scientist scientist1 = new Scientist("alex", 200, 200, 100, 5, "scientist", "geologist", 0);

        scientist1.displayInfo();

        Rover rover1 = new Rover("C3PO", 100, 100, true);

        rover1.displayInfo();

        Mission firstMission = new Mission("mission1", "save george lucas", 90, true);
    }
}