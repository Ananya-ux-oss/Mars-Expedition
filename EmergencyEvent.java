class EmergencyEvents {
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

    public void triggerEmergency() {
    resolved = false;

    System.out.println(
           
           "=== Mars Base Resources ===" +
           "type" + emergencytype +
           "severity level" + severitylevel

    );
    }

    public void resolveEmergency() {
    if (resolved) {
        System.out.println("Emergency is already resolved.");
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