public class EmergencyEvents {
    private String emergencytype;
    private int severitylevel;
    private boolean resolved;

    EmergencyEvents(String emergencytype, int severitylevel, boolean resolved) {
        this.emergencytype = emergencytype;
        this.severitylevel = severitylevel;
        this.resolved = resolved;
    }

    public String getEmergencytype() {
        return emergencytype;
    }

    public int getSeveritylevel() {
        return severitylevel;
    }

    public boolean getResolved() {
        return resolved;
    }

  public void triggerAlarm() {

        System.out.println("Critical warning: resiurces depleted");

    }

    //overload

    public void triggerAlarm(MarsBase base) {
    base.EmergencyStatus();
    resolved = false;

    System.out.println(
           
           "=== EMERGENCY ALERT ===\n" +
           "\nEmergency-type: " + emergencytype +
           "\nseverity level: " + severitylevel

        );
    }


    public void resolveEmergency() {
    if (resolved) {
        System.out.println("Emergency is resolved.");
        return;
    }

    resolved = true;
    System.out.println("Emergency has been resolved successfully.");
    }

    public void displayEmergencyStatus() {
    System.out.println(
      "=== Emergency Status ===" +
        "\nType: " + emergencytype +
        "\nSeverity Level: " + severitylevel +
        "\nResolved: " + resolved
    );
}

}
