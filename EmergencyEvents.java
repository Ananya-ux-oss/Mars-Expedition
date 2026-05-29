public class EmergencyEvents {
    private String emergencyType;
    private int severityLevel;
    private boolean isResolved;

    EmergencyEvents(String emergencyType, int severityLevel, boolean isResolved) {
        this.emergencyType = emergencyType;
        this.severityLevel = severityLevel;
        this.isResolved = isResolved;
    }

    //Getter
    public String getEmergencyType() {
        return emergencyType;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public boolean getResolved() {
        return isResolved;
    }

    //Methods
    public void triggerAlarm() {
        System.out.println("Critical warning: resiurces depleted");
    }

    //overload

    public void triggerAlarm(MarsBase base) {
        base.emergencyStatus();
        isResolved = false;

        System.out.println(   
           "=== EMERGENCY ALERT ===" +
           "\nEmergency-type: " + emergencyType +
           "\nseverity level: " + severityLevel
        );
    }

    public void resolveEmergency() {
        if (isResolved) {
            System.out.println("Emergency is resolved.");
            return;
        }

        isResolved = true;
        System.out.println("Emergency has been resolved successfully.");
    }

    public void displayEmergencyStatus() {
        System.out.println(
            "=== Emergency Status ===" +
            "\nType: " + emergencyType +
            "\nSeverity Level: " + severityLevel +
            "\nResolved: " + isResolved
        );
    }
}
